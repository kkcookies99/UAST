 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows>=len(s) or numRows<=1:
            return s
        res=''
        length=len(s)
        for j in range(0,length,2*numRows-2):
            res+=s[j]
        for i in range(2,numRows):
            j=i-1
            flag=True
            while j<length:
                res+=s[j]
                if flag:
                    j+=2*(numRows-i)
                    flag=False
                else:
                    j+=2*i-2
                    flag=True
        for j in range(numRows-1,length,2*numRows-2):
            res+=s[j]
        return res

