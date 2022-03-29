class Solution:
    def XXX(self, n: int) -> int: 
        dp=[0 for i in range(n+1)]
        for i in range(n+1):
            dp[i]=dp[i-1]+dp[i-2] if i>2 else i
        return dp[-1]

