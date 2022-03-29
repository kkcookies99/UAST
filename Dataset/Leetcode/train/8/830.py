 class Solution:
    def XXX(self, str: str) -> int:
        res = 0
        flag = True
        valid = False
        
        for i in str:
            if not valid:
                if i==' ':
                    pass
                elif i=='-':
                    valid = True
                    flag = False
                elif i=='+':
                    valid = True
                elif i < '0' or i > '9':
                    return res
                elif i >= '0' and i <= '9':
                    valid = True
                    res = res*10 + int(i)
            else:
                if i >= '0' and i <= '9':
                    valid = True
                    res = res*10 + int(i)
                else:
                    break
                
        if not flag:
            res = -res
            
        if res > 2**31 - 1:
            return 2**31 - 1
        elif res < -2**31:
            return -2**31
        else:
            return res

