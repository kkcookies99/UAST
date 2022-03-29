class Solution:
    def XXX(self, str: str) -> int:
        a = []
        b = ['0','1','2','3','4','5','6','7','8','9']
        num = 0
        while (len(str) > 0) and (str[0] ==' '):
            str = str[1:]
        if (len(str)==1 and str[0] not in b) or str == None :
            return 0
        elif (str[0] in ['+','-'] ) and (len(str)>1):
            for i in str[1:]:
                if i in b:
                    for j in range(len(b)):
                        if i == b[j]:
                            a.append(j)
                else:
                    break
        elif str[0] in b:
            for i in str:
                if i in b:
                    for j in range(len(b)):
                        if i == b[j]:
                            a.append(j)
                else:
                    break
        for i in range(len(a)):
            num += a[i]*10**(len(a)-i-1)
        if str[0] == '-':
            num = -num
        if num > 2**31-1:
            num = 2**31-1
        if num <= -2**31:
            num = -2**31
        return num

