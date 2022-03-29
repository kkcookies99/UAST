 class Solution:
    def XXX(self, str: str) -> int:
        i = 0
        s = ''
        why_not = True
        if str == '':
            return 0
        while i<len(str):
            if str[i] in '+-' and why_not:
                s+=str[i]
                why_not = False
            elif str[i] in '0123456789':
                s+=str[i]
                why_not = False
            elif str[i] == ' ' and len(s)==0:
                i+=1
                continue
            else:
                break
            i+=1
        if s == '':
            return 0
        elif len(s) == 1 and s[0] in '+-':
            return 0
        elif -2**31 <= int(s) <= 2**31-1:
            return int(s)
        else:
            return -2**31 if int(s) < -2**31 else 2**31-1     

