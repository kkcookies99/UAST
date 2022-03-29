 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        dp=[[1]*(numRows) for _ in range(numRows)]
        for i in range(1,numRows):
            for j in range(1,i):
                dp[i][j]=dp[i-1][j-1]+dp[i-1][j]
        for i in range(len(dp)):
            dp[i]=dp[i][:i+1]     
        return dp

