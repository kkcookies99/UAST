import torch
import torch.nn as nn
from torch.optim import Adam
import torch.nn.functional as F
import config
from data_loader_GAST import get_graph_dataloader
from tqdm import tqdm
import math
import numpy as np
import pickle
import math
from torch.nn.parameter import Parameter
from torch.nn.modules.module import Module


class GCN(nn.Module):
    def __init__(self, nfeat, nhid, nclass, dropout):
        super(GCN, self).__init__()

        self.gc1 = GraphConvolution(nfeat, nhid)
        self.gc2 = GraphConvolution(nhid, nclass)
        self.fc = nn.Linear(nclass*400, 50)

        self.dropout = dropout


    def forward(self, x, adj):
        x = F.relu(self.gc1(x, adj))
        x = F.dropout(x, self.dropout, training=self.training)
        x = self.gc2(x, adj) # [batchsize, node_num , class_num]
        x = x.view(x.size(0), x.size(1) * x.size(2))
        x = self.fc(x)
        # print(x.shape)
        # return F.log_softmax(x, dim=1)
        return F.log_softmax(x, dim=-1)


class GraphConvolution(nn.Module):

    def __init__(self, in_features, out_features, bias=True):
        super(GraphConvolution, self).__init__()
        self.in_features = in_features
        self.out_features = out_features
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
        output = torch.matmul(adj, support)

        if self.bias is not None:
            return output + self.bias
        else:
            return output

    def __repr__(self):
        return self.__class__.__name__ + ' (' \
               + str(self.in_features) + ' -> ' \
               + str(self.out_features) + ')'



def train(epoch, model, data_loader):
    print("start training...")

    # model = MyModel().to(config.device)
    # optimizer = Adam(model.parameters(),lr=0.001).to(config.device)
    # train_dataloader = get_dataloader(train=True) #loading data

    model.train()
    for i in range(epoch):

        for batch, (adj_matrix, fea_matrix, label) in tqdm(enumerate(data_loader), total=len(data_loader)):
            adj_matrix = adj_matrix.to(config.device)
            fea_matrix = fea_matrix.to(config.device)
            label = label.to(config.device)

            optimizer.zero_grad()  
            output = model(fea_matrix, adj_matrix)  
            loss = F.nll_loss(output, label) 
            loss.backward()  
            optimizer.step()  

        loss_epoch = loss.item()
        print("epoch: ", i, "  loss: ", loss_epoch)

        # # torch.save(model.state_dict(), "./checkpoints/test_mymodel_%d.pth" % i)
        torch.save(model.state_dict(), "./checkpoints/GAST-UV_model_5.pth")
        # # torch.save(optimizer.state_dict(), "./checkpoints/test_optimizer_%d.pth" % i)


def evaluate(model, data_loader):
    model.eval()

    
    loss_list = []
    acc_list = []
    label_list = []
    pred_list = []

    print("start evaluating...")
    for idx, (adj_matrix, fea_matrix, label) in tqdm(enumerate(data_loader), total=len(data_loader)):
        adj_matrix = adj_matrix.to(config.device)
        fea_matrix = fea_matrix.to(config.device)
        label = label.to(config.device)

        with torch.no_grad():
            output = model(fea_matrix,adj_matrix)  # [batchsize,2]
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


def test():
    print("starting testing!")

    loss_list = []
    acc_list = []
    label_list = []
    pred_list = []

    test_dataloder = get_graph_dataloader(train="test")

    model = GCN(nfeat=len(dict_ast_path),
                nhid=64,  #
                nclass=16,
                dropout=0.5).eval()
    model.load_state_dict(torch.load("./checkpoints/GAST-UV_model_5.pth"))
    # optimizer.load_state_dict(torch.load("./checkpoints/optimizer_4.pth"))

    model.to(config.device)
    # optimizer.cuda()

    for idx, (adj_matrix, fea_matrix, label) in tqdm(enumerate(test_dataloder), total=len(test_dataloder)):

        adj_matrix = adj_matrix.to(config.device)
        fea_matrix = fea_matrix.to(config.device)
        label = label.to(config.device)

        with torch.no_grad():
            output = model(fea_matrix, adj_matrix)
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
    dict_ast_path = pickle.load(open('./vocabulary/unified_vocab.pkl', 'rb'))
    print(len(dict_ast_path))
    model = GCN(nfeat=len(dict_ast_path),  
                nhid=64,  #
                nclass=16,
                dropout=0.5).to(config.device)
    optimizer = Adam(model.parameters(),lr=0.001)
    train_dataloader = get_graph_dataloader(train="train") #loading data
    train(5,model,train_dataloader)
    evaluate(model, train_dataloader)
    test()
    

