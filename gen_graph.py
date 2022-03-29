import re
import numpy as np
import pickle
import torch
import torch.nn.functional as F
import config



#--------------------------------------
# "module (function_definition name: (identifier) parameters: (parameters) body: (block (expression_statement (call function: (identifier) arguments: (argument_list (string)))))))"
#0(1(2)3(4)5(6(7(8(9)10(11(12)13))))))
#--------------------------------------
def get_numlist(ast_path):
    ast_path_list = []
    ast_path_split = re.split('[()]', ast_path)
    for i in ast_path_split:
        i = i.strip()
        if i is not "":
            ast_path_list.append(i)
    num_path = ast_path
    for i in range(len(ast_path_list)):
        num_path = num_path.replace(ast_path_list[i],str(i),1) #0 (1 (2) 3 (4) 5 (6 (7 (8 (9) 10 (11 (12)))))))
    num_path = num_path.replace(" ","")
    # print("num_path:",num_path)
    return num_path


#----------------------------------------------------
# 0(1(2)3(4)5(6(7(8(9)10(11(12))))))) -> [0,(,1,(,2,),3,(,4,),5,(,6,(,7,(,8,(,9,),10,(,11,(,12,),),),),),),)]
#----------------------------------------------------
def trans(string_ast):
    start = 0
    num_path_list = []
    for i in range(len(string_ast)):
        if string_ast[i]!="(" and string_ast[i]!=")" :
            if int(string_ast[i]) not in num_path_list:
                num_path_list.append(start)
                start += 1
            else:
                for j in range(i,len(string_ast)):
                    if string_ast[j] == ")" or string_ast[j] == "(":
                        if int(string_ast[i:j]) not in num_path_list:
                            num_path_list.append(int(string_ast[i:j]))
                        break
        if string_ast[i]=="(" or string_ast[i]==")":
            num_path_list.append(string_ast[i])
    return num_path_list

#--------------------------
#N*F [400,len(ast_dict)]
#--------------------------
def gen_feature(ast_path,dict_ast_path):
    ast_path_list = []
    ast_path = str(ast_path)
    ast_path_split = re.split('[()]', ast_path)
    for i in ast_path_split:
        i = i.strip()
        if i is not "":
            ast_path_list.append(i)
    AST_index = dict_ast_path.transform(ast_path_list)  # 一个长度为800
    AST_fea_tensor = torch.tensor(AST_index)
    fea_onehot = F.one_hot(AST_fea_tensor,num_classes=len(dict_ast_path))  # 默认按照targets其中的最大�?1作为one_hot编码的长�?
    # print(fea_onehot)
    # print(fea_onehot.shape)
    #padding tensor to 400-D
    if len(AST_fea_tensor) < config.max_len:
        padding_tensor = torch.zeros([config.max_len - len(ast_path_list),len(dict_ast_path)])
        feature_matrix = torch.cat((fea_onehot, padding_tensor), 0)
    else:
        feature_matrix = fea_onehot[:config.max_len]
    # N * F
    # print(feature_matrix.shape) # [400,len(dict_AST]
    return feature_matrix

#--------------------------
#N*N [400,400]
#--------------------------
def gen_adj(num_list,dict_num):
    # s = ["0", "(", "1", "(", "2", ")", "3", "(", "4", ")", "5", "(", "6", "(", "7", "(", "8", "(", "9", ")", "10", "(",
    #      "11", "(", "12", ")", ")", ")", ")", ")", ")"]
    #400*400
    adj_matrix = np.eye(config.max_len)  
    for i in range(config.max_len):
        if i < len(dict_num):
            child_list = get_child(i,num_list,dict_num)
            # print(child_list)
            if len(child_list) != 0:
                for j in child_list[1:-1]:
                    if int(j) < config.max_len: 
                        adj_matrix[i][int(j)] = 1
                        adj_matrix[int(j)][i] = 1
        else:
            break
    return adj_matrix



def get_child(num,num_list,dict_num):
    stack = []
    for i in range(dict_num[num], len(num_list)):
        stack.append(num_list[i])
        if num_list[i] == ")" and stack.count("(") > 1:
            while stack[-1] != "(":
                stack.pop()
            stack.pop()
    # print(stack)
    if stack[1] != "(":
        # print("[]")
        return []
    min_r = len(stack)
    for j in range(len(stack)):
        if stack[j] == ")" and min_r > j:
            min_r = j
    # print(stack[1:min_r + 1])
    return stack[1:min_r + 1]


def get_adj(ast_path):
    num_path = get_numlist(ast_path)
    # print(num_path)
    num_path_list = trans(num_path)
    dict_num = {}  
    for i in range(len(num_path_list)):
        if num_path_list[i] != "(" and num_path_list[i] != ")":
            dict_num[num_path_list[i]] = i
    return gen_adj(num_path_list, dict_num)

# if __name__ == '__main__':
#     # ast_path = "module (function_definition name: (identifier) parameters: (parameters) body: (block (expression_statement (call function: (identifier) arguments: (argument_list (string)))))))"
#     # print(ast_path)
#     # ast_path = "module (function_definition name: (identifier) parameters: (parameters) body: (block (expression_statement (call function: (identifier) arguments: (argument_list (string)))))))"
#     ast_path = "(translation_unit (function_definition type: (primitive_type) declarator: (function_declarator declarator: (identifier) parameters: (parameter_list)) body: (compound_statement (expression_statement (call_expression function: (identifier) arguments: (argument_list (string_literal)))))))"
#     # get_adj(ast_path)
#     fea_matrix = gen_feature(ast_path)
#     print(fea_matrix)
#     print(fea_matrix.shape)
