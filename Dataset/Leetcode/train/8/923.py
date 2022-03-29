 class Solution:
    def XXX(self, s: str) -> int:
        from string import digits
        res = list()
        s = s.strip()

        flag = 1
        if len(s) > 0:
            if s[0] == '-':
                flag = -1
                s = s[1:]
            elif s[0] == '+':
                flag = 1
                s = s[1:]
        if s == '' or s[0] not in digits:
            return 0
        for x in s:
            if x in digits:
                res.append(x)
            else:
                 break   
        res =  int(''.join(res)) * flag
        if flag == 1:
            if res > (1<<31) -1:
                return (1<<31) -1
            else: 
                return res
        else:
            if res < -(1<<31):
                return -(1<<31) 
            else:
                return res

