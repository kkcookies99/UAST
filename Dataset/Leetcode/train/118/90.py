 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        if numRows==0:
            return []
        yanghui=[]
        for i in range(numRows):
            yanghui.append([0]*(i+1))
        for i in range(numRows):
            yanghui[i][0]=1
            yanghui[i][-1]=1

        for i in range(1,numRows):
            for j in range(1,i):
                yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j]
        return yanghui

