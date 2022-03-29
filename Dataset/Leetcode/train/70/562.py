class Solution:
    def XXX(self, n: int) -> int:
        #动态规划
        dp = [None]*(n+1)
        for i in range(n+1):
            if i==0 or i==1:
                dp[i] = 1
            else:
                dp[i] = dp[i-1]+dp[i-2]
        return dp[i]

