 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        num=[[1]*i for i in range(1,numRows+1)]
        for i in range(2,numRows):
            num[i][0]=num[i][-1]=1
            for j in range(1,len(num[i])-1):
                num[i][j]= num[i-1][j-1]+num[i-1][j]
        return num

