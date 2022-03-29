import torch

device = torch.device("cuda:0")

batch_size = 64
max_len = 700 #the length of input ast path 
embedding_dim = 200
hidden_size = 64
num_layers = 2
bidirectional = True
dropout = 0.5