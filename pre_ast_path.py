# -*- coding = utf-8 -*-
# @Time: 2021/4/18 16:57
# @Author: CasoWang
# @Software: PyCharm
from os import path
from tree_sitter import Language, Parser
from pathlib import Path
import glob, os
import numpy as np
import logging
import platform
import tree_sitter_parsers
import re
import pickle
import json
from tqdm import tqdm

#---------------------------------------------
#1.构建token词典
#  把token转化成number序列
#---------------------------------------------
class Token2Num:
    UNK_TAG = "UNK" #uknown tag表示词典里面没有出现的词（用新的数据测试的时候）
    PAD_TAG = "PAD" #保证每一个batch都是一样的size

    UNK = 0
    PAD = 1
    def __init__(self):
        self.dict = {
            self.UNK_TAG:self.UNK,
            self.PAD_TAG:self.PAD
        }
        self.count = {} #统计词频


    def fit(self,codetokens):
        """把每一个code保存到dict里面
        :param codetokens : [codetoken1,codetoken2...]
        """
        for token in codetokens:
            self.count[token] = self.count.get(token,0) + 1 #统计词频 在的话就+1不再就为0

    def build_vocab(self,min=0,max=None,max_features=None):
        """
        生成词典
        :param min:最小出现的次数
        :param max:最大的次数
        :param max_features:一共保留多少个词语
        :return:
        """

        if min is not None:
            self.count = {token:value for token,value in self.count.items() if value > min}

        if max is not None:
            self.count = {token: value for token, value in self.count.items() if value < max}

        if max_features is not None:
            temp = sorted(self.count.items(),key=lambda x:x[-1],reverse=True)[:max_features]
            self.count = temp
        for token in self.count:
            self.dict[token] = len(self.dict) 


        self.inverse_dict = dict(zip(self.dict.values(),self.dict.keys()))

    def transform(self,codetokens,max_len=None):
        '''
        :param codetokens:  [codetoken1,codetoken2...]
        :param max_len: int, 
        :return:
        '''
        # for token in codetokens:
        #     self.dict.get(token,self.UNK)

        if max_len is not None:
            if max_len > len(codetokens):
                codetokens = codetokens + [self.PAD_TAG]*(max_len-len(codetokens)) #填充
            if max_len < len(codetokens):
                codetokens = codetokens[:max_len] #裁剪
        return [self.dict.get(token,self.UNK) for token in codetokens]

    def inverse_transform(self,indices):
        '''
        :param indices: [1,2,3,4,...]
        :return:
        '''
        return [self.inverse_dict.get(idx) for idx in indices]

    def __len__(self):
        return len(self.dict)

#---------------------------------------------
#2.把所有语言的源代码解析成AST
#---------------------------------------------
class ASTParser():
    import logging
    LOGGER = logging.getLogger('ASTParser')
    def __init__(self, language=None):
        # ------------ To initialize for the treesitter parser ------------
        home = str(Path.home())
        cd = os.getcwd()
        plat = platform.system()
        p = path.join(home, ".tree-sitter")
        os.chdir(path.join(p, "tree-sitter-parsers-" + plat))
        self.Languages = {}
        for file in glob.glob("*.so"):
            try:
                lang = os.path.splitext(file)[0]
                self.Languages[lang] = Language(path.join(p, "tree-sitter-parsers-" + plat, file), lang)
            except:
                print("An exception occurred to {}".format(lang))
        os.chdir(cd)
        self.parser = Parser()

        self.language = language
        if self.language == None:
            self.LOGGER.info(
                "Cannot find language configuration, using java parser as the default to parse the code into AST")
            self.language = "java"

        lang = self.Languages.get(self.language)
        self.parser.set_language(lang)
        # -----------------------------------------------------------------
    def parse_with_language(self, code_snippet, language):
        lang = self.Languages.get(language)
        self.parser.set_language(lang)
        return self.parser.parse(bytes(code_snippet,"utf8"))
    #解析代码成ast
    # return: tree_sitter.Tree object
    def parse(self, code_snippet):
        return self.parser.parse(bytes(code_snippet,"utf8"))

    def set_language(self, language):
        lang = self.Languages.get(language)
        self.parser.set_language(lang)


def remove_comments_and_docstrings(source):
    def replacer(match):
        s = match.group(0)
        if s.startswith('/'):
            return " "  # note: a space and not an empty string
        else:
            return s

    pattern = re.compile(
        r'//.*?$|/\*.*?\*/|\'(?:\\.|[^\\\'])*\'|"(?:\\.|[^\\"])*"',
        re.DOTALL | re.MULTILINE
    )
    temp = []
    for x in re.sub(pattern, replacer, source).split('\n'):
        if x.strip() != "":
            temp.append(x)
    return '\n'.join(temp)

#根据文件的扩展名字来决定解析的语言
language = {
    "c": "c",
    "cs": "c_sharp",
    "cc": "cpp",
    "cpp": "cpp",
    "css": "css",
    "elm": "elm",
    "go": "go",
    "html": "html",
    "hs": "haskell",
    "java": "java",
    "js": "javascript",
    "kt": "kotlin",
    "lua": "lua",
    "php": "php",
    "py": "python",
    "rb": "ruby",
    "rs": "rust",
    "scala": "scala",
    "sol": "solidity",
    "sh": "bash",
    "v": "verilog",
    "yaml": "yaml",
    "yml": "yaml",
}

    # return ast_path


#---------------------------------------------
#---------------------------------------------
class ASTDict:
    UNK_TAG = "UNK"
    PAD_TAG = "PAD"

    UNK = 0
    PAD = 1
    def __init__(self):
        self.dict = {
            self.UNK_TAG:self.UNK,
            self.PAD_TAG:self.PAD
        }
        self.count = {}


    def fit(self,codetokens):
        for token in codetokens:
            self.count[token] = self.count.get(token,0) + 1

    def build_vocab(self,min_value=0,max_value=None,max_features=None):
        if min_value is not None:
            self.count = {token:value for token,value in self.count.items() if value > min_value}
        if max_value is not None:
            self.count = {token: value for token, value in self.count.items() if value < max_value}
        if max_features is not None:
            temp = sorted(self.count.items(),key=lambda x:x[-1],reverse=True)[:max_features]
            self.count = temp
        for token in self.count:
            self.dict[token] = len(self.dict)

        self.inverse_dict = dict(zip(self.dict.values(),self.dict.keys()))

    def transform(self,codetokens,max_len=None):
        # for token in codetokens:
        #     self.dict.get(token,self.UNK)

        if max_len is not None:
            if max_len > len(codetokens):
                codetokens = codetokens + [self.PAD_TAG]*(max_len-len(codetokens))
            if max_len < len(codetokens):
                codetokens = codetokens[:max_len]
        return [self.dict.get(token,self.UNK) for token in codetokens]

    def inverse_transform(self,indices):

        return [self.inverse_dict.get(idx) for idx in indices]

    def __len__(self):
        return len(self.dict)


def returnfiles(datapath):
    all_files = []
    for filepath, dirnames, filenames in os.walk(datapath):
        if len(filenames)!=0:
            for file in filenames:
                all_files.append(filepath+"/"+file)
    return all_files

def get_ast_path_dict(filepath):
    '''
    :param filepath:
    :return: list of ast_path
    '''
    from pre_ast_path import ASTDict
    ASTpath = ASTDict()
    filenames = returnfiles(filepath) 
    print(len(filenames))
    for code_file in filenames:
        # print(code_file)
        extension = code_file.split(".")[-1]
        # print(extension)
        lang = language[extension]
        with open(code_file, "r", encoding='utf-8') as file:
            code = file.read()
        ast = ASTParser(language=lang)
        tree = ast.parse_with_language(code_snippet=code, language=lang)
        root_node = tree.root_node
        ast_path = root_node.sexp()
        ast_path_list = []
        ast_path = re.split('[()]', ast_path)
        for i in ast_path:
            i = i.strip()
            if i != "":
                ast_path_list.append(i)
        # print(ast_path_list)
        ASTpath.fit(ast_path_list)
        # break

    ASTpath.build_vocab(min_value=0)
    pickle.dump(ASTpath, open("./vocabulary/dict_AST_path.pkl", "wb"))
    print("finish building vocabulary!")
    print("the lenth of vocab is: ", len(ASTpath.dict))
        # break


if __name__ == '__main__':
    get_ast_path_dict("./leetcode")


    # with open("1.java", "r", encoding='utf-8') as file:
    #     java_code = file.read()
    #     java_code = remove_comments_and_docstrings(java_code)
    #     print(java_code)
    # ast = ASTParser(language="java")
    # tree = ast.parse_with_language(code_snippet=java_code,language="java")
    # print(tree)
    # root_node = tree.root_node
    # # print(root_node)
    # print(root_node.sexp())