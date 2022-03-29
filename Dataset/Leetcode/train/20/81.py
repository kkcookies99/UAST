 class Solution:
# 自己手写
    def XXX(self, s: str) -> bool:
        alist = ['1']     # 把这里面的1换成非整数就能提交了
        dict = {'{': '}', '[': ']', '(': ')','?': '?'}
        for j in s:
            if j in ['{', '[', '(']:
                alist.append(j)
            elif dict[alist.pop()] != j:
                    return False
        return len(alist) ==1    

# 标准答案
    # def XXX(self, s: str) -> bool:
    #     dic = {'{': '}',  '[': ']', '(': ')', '?': '?'}
    #     stack = ['?']
    #     for c in s:
    #         if c in dic: 
    #             stack.append(c)
    #         elif dic[stack.pop()] != c:
    #              return False 
    #     return len(stack) == 1

