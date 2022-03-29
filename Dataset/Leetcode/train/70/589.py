class Solution:
    def XXX(self, n: int) -> int:
        dp=[]
        dp.append(1)
        dp.append(2)
        for i in range(2,n):
            dp.append(dp[i-1]+dp[i-2])
        return dp[n-1]

