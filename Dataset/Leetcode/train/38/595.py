 class Solution:
    def XXX(self, n: int) -> str:
        self.n = n
        return self.recursior(1,'1')
    
    def recursior(self,count,s):
        if count == self.n:
            return s
        else:
            if len(s) == 1:
                return self.recursior(count+1,'11')
            else:
                temp = ''
                c = 1
                for i in range(1,len(s)):
                    if s[i] != s[i-1]:
                        if i == len(s)-1:
                            temp = temp +str(c)+s[i-1] + '1' + s[i]
                        else:
                            temp = temp + str(c)+s[i-1]
                            c = 1
                    else:
                        if i == len(s)-1:
                            c += 1
                            temp = temp + str(c)+s[i-1]
                        else:
                            c += 1
                return self.recursior(count+1,temp)

