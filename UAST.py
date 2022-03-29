# -*- coding = utf-8 -*-
# @Time: 2021/3/31 10:51
# @Author: CasoWang
# @File: attention.py
# @Software: PyCharm

import torch
import torch.nn as nn
from torch.optim import Adam
import torch.nn.functional as F
from data_loader_UAST import get_fusion_dataloader
import config
from tqdm import tqdm
import math
import numpy as np
import os
import pickle
import matplotlib.pyplot as plt
import seaborn as sns
import palettable  

from torch.nn.parameter import Parameter
from torch.nn.modules.module import Module

dict_ast_path = pickle.load(open('./vocabulary/unified_vocab.pkl', 'rb'))

#SAST
class ASTModal(nn.Module):
    def __init__(self):
        super(ASTModal, self).__init__()
        # 1.input embedding
        self.ASTEmbedding = nn.Embedding(len(dict_ast_path), config.embedding_dim)  

        # 2.self-attention
        self.attention = SelfAttention(hidden_size=config.embedding_dim, num_attention_heads=4, dropout_prob=0.2)

        # 3.bi-LSTM
        self.lstm = nn.LSTM(input_size=config.embedding_dim,
                            hidden_size=config.hidden_size,  
                            num_layers=config.num_layers,  
                            batch_first=True,  
                            dropout=config.dropout,
                            bidirectional=config.bidirectional)

        # 4.fully connect
        self.fc = nn.Linear(config.hidden_size * 2, 50) 

    def forward(self, input_AST, x_mask):
        # 1. embedding: [batchsize,max_len,embedding_dim]
        AST_path = self.ASTEmbedding(input_AST)

        AST_att = self.attention(AST_path, x_mask)


        #3. bi-lstm
        token_att, (h_n_t, c_n_t) = self.lstm(AST_att)
        output_fw_t = h_n_t[-2, :, :]  
        output_bw_t = h_n_t[-1, :, :] 
        output_t = torch.cat([output_fw_t, output_bw_t], dim=-1)  # [batchsize,hidden_size*2] 

        #4. fully connect + softmax
        sast_out = self.fc(output_t)  # [batchsize,2]
        # return F.log_softmax(out, dim=-1)  # [batchsize,2]
        return sast_out

class SelfAttention(nn.Module):

    def __init__(self, hidden_size, num_attention_heads, dropout_prob):
        super(SelfAttention, self).__init__()
        if hidden_size % num_attention_heads != 0: 
            raise ValueError(
                "The hidden size (%d) is not a multiple of the number of attention "
                "heads (%d)" % (hidden_size, num_attention_heads))
        self.num_attention_heads = num_attention_heads  # 8
        self.attention_head_size = int(hidden_size / num_attention_heads)  # 16 
        self.all_head_size = int(self.num_attention_heads * self.attention_head_size)
        # all_head_size = 128 



        self.query = nn.Linear(hidden_size, self.all_head_size)  # 128, 128
        self.key = nn.Linear(hidden_size, self.all_head_size)
        self.value = nn.Linear(hidden_size, self.all_head_size)

        # dropout
        self.dropout = nn.Dropout(dropout_prob)

    def transpose_for_scores(self, x):
        # INPUT:  x'shape = [bs, seqlen, hid_size]  
        new_x_shape = x.size()[:-1] + (self.num_attention_heads, self.attention_head_size)  # [bs, seqlen, 8, 16]
        x = x.view(*new_x_shape)  #
        return x.permute(0, 2, 1, 3)  # [bs, 8, seqlen, 16]

    def forward(self, hidden_states, attention_mask):
        # eg: attention_mask = torch.LongTensor([[1, 1, 1], [1, 1, 0]])  shape=[bs, seqlen]
        attention_mask = attention_mask.unsqueeze(1).unsqueeze(2)  
        attention_mask = (1.0 - attention_mask) * -10000.0  

        # print("hidden_states,hidden_states.shape)
        mixed_query_layer = self.query(hidden_states)  # [bs, seqlen, hid_size]
        mixed_key_layer = self.key(hidden_states)  # [bs, seqlen, hid_size]
        mixed_value_layer = self.value(hidden_states)  # [bs, seqlen, hid_size]

        query_layer = self.transpose_for_scores(mixed_query_layer)  # [bs, 8, seqlen, 16]
        key_layer = self.transpose_for_scores(mixed_key_layer)
        value_layer = self.transpose_for_scores(mixed_value_layer)  # [bs, 8, seqlen, 16]

        attention_scores = torch.matmul(query_layer, key_layer.transpose(-1, -2))
        # [bs, 8, seqlen, 16]*[bs, 8, 16, seqlen]  ==> [bs, 8, seqlen, seqlen]
        attention_scores = attention_scores / math.sqrt(self.attention_head_size)  # [bs, 8, seqlen, seqlen]
        attention_scores = attention_scores + attention_mask


        attention_probs = nn.Softmax(dim=-1)(attention_scores)  # [bs, 8, seqlen, seqlen]

        # This is actually dropping out entire tokens to attend to, which might
        # seem a bit unusual, but is taken from the original Transformer paper.
        attention_probs = self.dropout(attention_probs)

        #bs, 8, seqlen, seqlen]*[bs, 8, seqlen, 16] = [bs, 8, seqlen, 16]
        context_layer = torch.matmul(attention_probs, value_layer)  # [bs, 8, seqlen, 16]
        context_layer = context_layer.permute(0, 2, 1, 3).contiguous()  # [bs, seqlen, 8, 16]
        new_context_layer_shape = context_layer.size()[:-2] + (self.all_head_size,)  # [bs, seqlen, 128]
        context_layer = context_layer.view(*new_context_layer_shape)
        return context_layer  

#GAST
class GCN(nn.Module):
    def __init__(self, nfeat, nhid, nclass, dropout):
        super(GCN, self).__init__()

        self.gc1 = GraphConvolution(nfeat, nhid)
        self.gc2 = GraphConvolution(nhid, nclass)
        self.fc = nn.Linear(nclass*config.max_len, 50)
        self.dropout = dropout


    def forward(self, x, adj):
        x = F.relu(self.gc1(x, adj))
        x = F.dropout(x, self.dropout, training=self.training)
        x = self.gc2(x, adj) # [batchsize, node_num , class_num]
        x = x.view(x.size(0), x.size(1) * x.size(2))
        gast_out = self.fc(x)
        # print(x.shape)
        # return F.log_softmax(x, dim=1)
        return gast_out

class GraphConvolution(nn.Module):

    def __init__(self, in_features, out_features, bias=True):
        super(GraphConvolution, self).__init__()
        self.in_features = in_features
        self.out_features = out_features
        # parameter
        self.weight = Parameter(torch.FloatTensor(in_features, out_features))
        if bias:
            self.bias = Parameter(torch.FloatTensor(out_features))
        else:
            self.register_parameter('bias', None)
        self.reset_parameters()

    
    def reset_parameters(self):

        stdv = 1. / math.sqrt(self.weight.size(1))
        self.weight.data.uniform_(-stdv, stdv)
        if self.bias is not None:
            self.bias.data.uniform_(-stdv, stdv)

    def forward(self, input_X, adj):

        support = torch.matmul(input_X, self.weight)
        # output = torch.spmm(adj, support)
        output = torch.matmul(adj, support)

        if self.bias is not None:
            return output + self.bias
        else:
            return output

    def __repr__(self):
        return self.__class__.__name__ + ' (' \
               + str(self.in_features) + ' -> ' \
               + str(self.out_features) + ')'


class BAST(nn.Module):
    def __init__(self):
        super(BAST, self).__init__()

        self.sast = ASTModal()
        self.gast = GCN(nfeat=len(dict_ast_path),  
                        nhid=64,  #
                        nclass=16,
                        dropout=0.5)
        # self.fc = nn.Linear(100, 50)


    def forward(self, ast_path, adj_matrix,fea_matrix,x_mask):  
        sast_feature = self.sast(ast_path, x_mask) # [batchsize,50]
        gast_feature = self.gast(fea_matrix,adj_matrix) # [batchsize,50]
        fusion = sast_feature + gast_feature
        # print(fusion.shape)
        # out = self.fc(fusion)  # [batchsize,50]
        return F.log_softmax(fusion, dim=-1) #[bs,50]
        


def sequence_mask(input_):
    batch_size, seq_len = input_.size()
    mask = 1 - torch.triu(torch.ones((batch_size, seq_len), dtype=torch.uint8),
                          diagonal=1)
    # [B, L, L]
    return mask


def drawGraph(input_matrix):
    sns.set()
    plt.figure(dpi=120)
    sns.heatmap(data=input_matrix.cpu().numpy(),
                cmap=plt.get_cmap('Greens'),  # matplotlib
                )
    plt.title("Token original")
    plt.show()


def train(epoch, model, data_loader):
    print("start training...")

    # model = MyModel().to(config.device)
    # optimizer = Adam(model.parameters(),lr=0.001).to(config.device)
    # train_dataloader = get_fusion_dataloader(train=True) #loading data

    model.train()
    for i in range(epoch):
        for batch, (ast_path, adj_matrix, fea_matrix, label) in tqdm(enumerate(data_loader), total=len(data_loader)):
            
            ast_path = ast_path.to(config.device)
            adj_matrix = adj_matrix.to(config.device)
            fea_matrix = fea_matrix.to(config.device)
            label = label.to(config.device)
            x_mask = sequence_mask(ast_path).to(config.device)  # self attention

            optimizer.zero_grad() 
            output = model(ast_path, adj_matrix,fea_matrix,x_mask)  
            loss = F.nll_loss(output, label)  
            loss.backward() 
            optimizer.step() 

        loss_epoch = loss.item()
        print("epoch: ", i, "  loss: ", loss_epoch)

        # if epoch % 2 == 0:  
        #     for params in optimizer.param_groups:  
        #         params['lr'] *= 0.8  

       
        # torch.save(model.state_dict(), "./checkpoints/test_mymodel_%d.pth" % i)
        torch.save(model.state_dict(), "./checkpoints/UAST_model_3_len700.pth")
        # torch.save(optimizer.state_dict(), "./checkpoints/test_optimizer_%d.pth" % i)


def evaluate(model, data_loader):
    
    model.eval()

    
    loss_list = []
    acc_list = []
    label_list = []
    pred_list = []

    print("start evaluating...")
    for batch, (ast_path, adj_matrix, fea_matrix, label) in tqdm(enumerate(data_loader), total=len(data_loader)):
        
        ast_path = ast_path.to(config.device)
        adj_matrix = adj_matrix.to(config.device)
        fea_matrix = fea_matrix.to(config.device)
        label = label.to(config.device)
        x_mask = sequence_mask(ast_path).to(config.device)  # self attention


        with torch.no_grad():
            output = model(ast_path, adj_matrix,fea_matrix,x_mask)  # [batchsize,2]
            # print("\n output:  ",output)
            cur_loss = F.nll_loss(output, label)
            loss_list.append(cur_loss.cpu().item())

            pred = output.max(dim=-1)[-1]
            # print("\n prediction:  ",pred)
            for i in label:
                label_list.append(i.cpu().numpy())
            for j in pred:
                pred_list.append(j.cpu().numpy())
            cur_acc = pred.eq(label).float().mean()
            acc_list.append(cur_acc.cpu().item())

    print("total loss, ", np.mean(loss_list), "acc:", np.mean(acc_list))

    
    from sklearn.metrics import recall_score
    recall_val = recall_score(label_list, pred_list, average='macro')
    from sklearn.metrics import precision_score
    precision_val = precision_score(label_list, pred_list, average='macro')
    from sklearn.metrics import f1_score
    f1_val = f1_score(label_list, pred_list, average='macro')
    result = {
        "eval_recall": float(recall_val),
        "eval_precision": float(precision_val),
        "eval_f1": float(f1_val),
    }
    print(result)

    
    # model.train()


def test():
    print("starting testing!")

    loss_list = []
    acc_list = []
    label_list = []
    pred_list = []

    test_dataloder = get_fusion_dataloader(train="test")  
    
    model = BAST().eval()
    model.load_state_dict(torch.load("./checkpoints/UAST_model_3_len700.pth"))
    # optimizer.load_state_dict(torch.load("./checkpoints/optimizer_4.pth"))

    model.to(config.device)
    # optimizer.cuda()

    for batch, (ast_path, adj_matrix, fea_matrix, label) in tqdm(enumerate(test_dataloder), total=len(test_dataloder)):

        ast_path = ast_path.to(config.device)
        adj_matrix = adj_matrix.to(config.device)
        fea_matrix = fea_matrix.to(config.device)
        label = label.to(config.device)
        x_mask = sequence_mask(ast_path).to(config.device)  # self attention

        with torch.no_grad():
            output = model(ast_path, adj_matrix,fea_matrix,x_mask)
            cur_loss = F.nll_loss(output, label)
            loss_list.append(cur_loss.cpu().item())

            pred = output.max(dim=-1)[-1]
            for i in label:
                label_list.append(i.cpu().numpy())
            for j in pred:
                pred_list.append(j.cpu().numpy())
            cur_acc = pred.eq(label).float().mean()
            acc_list.append(cur_acc.cpu().item())

    print("total loss, ", np.mean(loss_list), "acc:", np.mean(acc_list))

    from sklearn.metrics import recall_score
    recall_val = recall_score(label_list, pred_list, average='macro')
    from sklearn.metrics import precision_score
    precision_val = precision_score(label_list, pred_list, average='macro')
    from sklearn.metrics import f1_score
    f1_val = f1_score(label_list, pred_list, average='macro')
    result = {
        "eval_recall": float(recall_val),
        "eval_precision": float(precision_val),
        "eval_f1": float(f1_val),
    }
    print(result)



if __name__ == '__main__':
    print(len(dict_ast_path))
    model = BAST().to(config.device)
    optimizer = Adam(model.parameters(),lr=0.001)
    train_dataloader = get_fusion_dataloader(train="train") #loading data
    train(3,model,train_dataloader)
    # valid_dataloader = get_fusion_dataloader(train="valid") #loading data
    # evaluate(model, valid_dataloader)
    # test()
    # for i in range(10):
    #     test()
