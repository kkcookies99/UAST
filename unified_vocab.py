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
    def parse(self, code_snippet):
        return self.parser.parse(bytes(code_snippet,"utf8"))

    def set_language(self, language):
        lang = self.Languages.get(language)
        self.parser.set_language(lang)


def remove_comments_and_docstrings(source):
    def replacer(match):
        s = match.group(0)
        if s.startswith('/'):
            return " "
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


language = {
    "c": "c",
    "cpp": "cpp",
    "java": "java",
    "js": "javascript",
    "py": "python",
}


#替换
unified_vocab_dict = {
    "translation_unit":"unit",
    "program":"unit",
    "module":"unit",
    "compound_statement":"block",
    "statement_block":"block",
    "intergral_type":"primitive_type",
    "floating_point_type":"primitive_type",
    "decimal_floating_point_literal":"primitive_type",
    "string":"string_literal",
    "formal_parameter type:":"parameter_declaration type:",

    "character_literal": "char_literal",
    "dimensions:":"dimensions",
    "function_declarator declarator:":"method_declaration",
    "function_definition type:":"method_declaration type:",
    "type_parameters:":"type_parameters"
}

    # return ast_path


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
     from unified_vocab import ASTDict
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
          #ruled!!!

          for key,value in unified_vocab_dict.items():
               ast_path = ast_path.replace(key,value)
          ast_path_list = []
          ast_path = re.split('[()]', ast_path)
          for i in ast_path:
               i = i.strip()
               if i != "":
                    # print(i)
                    ast_path_list.append(i)
          ASTpath.fit(ast_path_list)
     ASTpath.build_vocab(min_value=0)
     pickle.dump(ASTpath, open("./vocabulary/unified_vocab.pkl", "wb"))
     print("finish building vocabulary!")
     print("the lenth of vocab is: ", len(ASTpath.dict))


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