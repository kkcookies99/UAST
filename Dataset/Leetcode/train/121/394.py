 class Solution:
    def XXX(self, prices: List[int]) -> int:
        dp=[0for _ in prices]
        m=prices[0]
        for i in range(1,len(prices)):
            m=min(m,prices[i])
            dp[i]=max(dp[i-1],prices[i]-m)
        return dp[-1]

