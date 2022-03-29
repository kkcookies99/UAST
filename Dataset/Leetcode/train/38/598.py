 class Solution:
    def XXX(self, n: int) -> str:
        if n == 1: return '1'
        if n >= 2:
            s = self.XXX(n-1)
            conut = {}
            j=0
            res = []
            res.append(s[0])
            fi = ''
            conut.setdefault(0,1)
            for i in range(1,len(s)):
                if s[i] == s[i-1]:
                    conut[j] += 1
                else:
                    conut.setdefault(j+1,1)
                    j = j+1
                    res.append(s[i])
            for i in range(len(res)):
                fi += str(conut[i])+res[i]
            return fi


