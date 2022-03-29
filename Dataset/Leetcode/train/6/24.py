 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows==1 or numRows>=len(s) :return s
        r,j,k=['']*numRows,0,1
        for i in s:
            r[j]+=i
            j+=k
            if j==0 or j==numRows-1 : k=-k
        return "".join(r)
        

