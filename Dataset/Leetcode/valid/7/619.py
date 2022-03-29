 class Solution:
    def XXX(self, x: int) -> int:
        s = str(x)
        maxlimit = str(pow(2,31))
        if s[0] == '-':
            res =s[:0:-1].strip('0')
            if len(res) > len(maxlimit) or not res:
                return 0 
            elif len(res) == len(maxlimit):
                for a,b in zip(res,maxlimit):
                    if a == b :
                        continue
                    elif a > b :
                        return 0
                    elif a < b :
                        return eval('-' + res)
            else:
                return eval('-'+ res) 
        else:
            res = s[::-1].strip('0')
            if len(res) > len(maxlimit) or not res :
                return 0 
            elif len(res) == len(maxlimit):
                for a,b in zip(res,maxlimit):
                    if a == b :
                        continue
                    elif a > b :
                        return 0
                    elif a < b :
                        return eval(res)
            else:       
                return eval(res)

