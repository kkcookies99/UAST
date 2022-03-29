 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        newstr = ''
        c = 2*numRows - 2
        if numRows > c:
            return s
        else:
            for i in range(0, len(s), c):
                newstr += s[i]
            for j1 in range(1, numRows - 1):
                for j2 in range(j1, len(s), c): 
                    try:
                        newstr += s[j2]
                        newstr += s[j2+c-2*j1]
                    except:
                        pass
                
            for k in range(numRows-1, len(s), c):
                newstr += s[k]

            return newstr

