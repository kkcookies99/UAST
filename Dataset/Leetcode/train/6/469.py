 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows==1 or numRows>=len(s):
            return s
        result=''
        for j in range(numRows):
            i=j
            for u in range(len(s)):
                if 0<j<numRows-1:
                    w=(i-2*j)
                    if 0<w<len(s):
                        result+=s[w]
                if i<len(s):
                    result+=s[i]
                i+=(2*numRows-2)
        return result
      

