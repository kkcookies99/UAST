 class Solution:
    def XXX(self, numRows: int) -> list[list[int]]:
        ls=[]
        for i in range(numRows):
            row=[]
            for j in range(numRows):
                row.append(0)
            ls.append(row)
        for i in range(numRows):
            ls[i][0]=1
        for i in range(1,numRows):
            for j in range(1,numRows):
                ls[i][j]=ls[i-1][j]+ls[i-1][j-1]
        for i in range(numRows):
            for j in range(numRows-i-1):
                del ls[i][i+1:]
        return ls

