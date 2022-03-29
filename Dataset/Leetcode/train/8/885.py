 class Solution:
    def XXX(self, str: str) -> int:
        import sys 
        INT_MAX = 2**31-1
        INT_MIN = (-2)**31
        str = str.strip()
        num_str = []
        for i,char in enumerate(str):
            if char in ['-','+'] and i ==0:
                num_str.append(char)
                continue
            if char in ['0','1','2','3','4','5','6','7','8','9']:
                num_str.append(char)
            else:
                break
        res = 0
        flag = True
        for i in num_str:
            if i == '-':
                flag = False
            if i in ['0','1','2','3','4','5','6','7','8','9']:
                res = res*10 + int(i)
            else:
                continue
        if not flag:
            res = -res

        if res > INT_MAX:
            
            return INT_MAX
        elif res < INT_MIN:
            return INT_MIN
        else:
            return res


