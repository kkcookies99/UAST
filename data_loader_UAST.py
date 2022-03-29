# -*- coding = utf-8 -*-
# @Time: 2021/3/20 16:23
# @Author: CasoWang
# @File: dataset.py
# @Software: PyCharm

import torch
from torch.utils.data import Dataset, DataLoader
from pre_ast_path import ASTParser
from tqdm import tqdm, trange
import multiprocessing
from multiprocessing import Process, freeze_support
import pickle
import config
import os
import re
from gen_graph import get_adj, gen_feature
from unified_vocab import unified_vocab_dict

dict_ast_path = pickle.load(open('./vocabulary/unified_vocab.pkl', 'rb'))

language = {
    "c": "c",
    "cpp": "cpp",
    "java": "java",
    "js": "javascript",
    "py": "python"
}

#问题映射
problem_map = {'1':0,'100':1,
    '101':2, '102':3, '104':4, '11':5, '110':6, '111':7, '112':8, '118':9, 
    '12':10, '121':11, '125':12, '13':13, '136':14, '14':15, '15':16, '19':17, 
    '2':18, '20':19, '22':20, '26':21, '27':22, '28':23, '3':24, '35':25, '38':26,
    '4':27, '46':28, '48':29, '5':30, '53':31, '55':32, '56':33, '58':34, '6':35,
    '62':36, '66':37, '67':38, '69':39, '7':40, '70':41, '75':42, '78':43, '8':44,
    '83':45, '88':46, '9':47, '94':48, '98':49}

def walkFile(file):
    for root, dirs, files in os.walk(file):
        file_name_list = []
        for d in dirs:
            file_name_list.append(os.path.join(root, d))
        return file_name_list


def returnfiles(datapath):
    all_files = []
    for filepath, dirnames, filenames in os.walk(datapath):
        if len(filenames)!=0:
            for file in filenames:
                all_files.append(filepath+"/"+file)
    return all_files



def get_example(item):


    code, label, extension = item
    ast = ASTParser(language=language[extension])
    tree = ast.parse_with_language(code_snippet=code, language=language[extension])
    root_node = tree.root_node
    ast_path = root_node.sexp()

    #ruled!!!
    #替换
    for key,value in unified_vocab_dict.items():
        ast_path = ast_path.replace(key,value)


    ast_path_list = []
    ast_path = re.split('[()]', ast_path)
    for i in ast_path:
        i = i.strip()
        if i != "":
            ast_path_list.append(i)

    AST_index = dict_ast_path.transform(ast_path_list, max_len=int(config.max_len)) 
    
    
    ast_path = root_node.sexp()

    #ruled!!!
    #替换
    for key,value in unified_vocab_dict.items():
        ast_path = ast_path.replace(key,value)

    adj_matrix = get_adj(ast_path)
    #print(len(dict_ast_path))
    fea_matrix = gen_feature(ast_path,dict_ast_path)
    fea_matrix = fea_matrix.numpy()


    return [AST_index, adj_matrix, fea_matrix, label]

    # return InputFeatures(code_token1, code_token2, label, url1, url2)


class MyDataset(Dataset):
    def __init__(self, file_path=r'./leetcode/train', pool=None):
        file_name = returnfiles(file_path) 
        self.examples = []
        data = []
        for file in file_name:
            file_split = file.split("/")
            extension = file_split[-1].split(".")[-1]
            with open(file,"r",encoding='utf-8') as f:
                code = f.read()
                # input_code = f.read() 
                label = problem_map[file_split[-2]]
                data.append((code, int(label),extension))
        self.examples = pool.map(get_example, data)

    def __len__(self):
        return len(self.examples)

    def __getitem__(self, index):

        # print(self.examples[index].url1,self.examples[index].code_token1,self.examples[index].label)
        AST_index = self.examples[index][0]
        adj_matrix = self.examples[index][1]  # [1,5,3,6,...]
        fea_matrix = self.examples[index][2]
        label = self.examples[index][3]
        return AST_index,adj_matrix,fea_matrix, label
        # return torch.tensor(torch.tensor(self.examples[item].label))


def collate_fn(batch):
    AST_index, adj_matrix,fea_matrix, label = list(zip(*batch))
    AST_index = torch.LongTensor(AST_index)
    adj_matrix = torch.FloatTensor(adj_matrix)
    fea_matrix = torch.FloatTensor(fea_matrix)
    label = torch.LongTensor(label)
    return AST_index,adj_matrix, fea_matrix, label


def get_fusion_dataloader(train="train"):
    print("get dataloader!")
    cpu_cont = 5
    
    pool = multiprocessing.Pool(cpu_cont)

    if train == "train":
        print("get train dataloader!")
        data = MyDataset(file_path=r'./leetcode/train', pool=pool)
        data_loader = DataLoader(data, batch_size=config.batch_size, shuffle=True,
                                 collate_fn=collate_fn,num_workers=0)  # return: the number of batch
    elif train == "valid":
        print("get valid dataloader!")
        data = MyDataset(file_path=r'./leetcode/valid', pool=pool)
        data_loader = DataLoader(data, batch_size=config.batch_size, shuffle=True,
                                 collate_fn=collate_fn,num_workers=0)  # return: the number of batch
    elif train == "test":
        print("get test dataloader!")
        test_data = MyDataset(file_path=r'./leetcode/test', pool=pool)
        data_loader = DataLoader(test_data, batch_size=config.batch_size, shuffle=True, collate_fn=collate_fn,num_workers=0)
    
    return data_loader


if __name__ == '__main__':
     data_loader = tqdm(get_fusion_dataloader(train="train"))
     for idx,(ast_index, adj_matrix, fea_matrix, label) in tqdm(enumerate(data_loader), total=len(data_loader)):
         print('idx',idx)
         print('ast_index',ast_index)
         print('adj_matrix', adj_matrix)
         print('fea_matrix',fea_matrix)
         print('label',label)
         break
