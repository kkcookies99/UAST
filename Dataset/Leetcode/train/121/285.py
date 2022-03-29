 class Solution:
    def XXX(self, prices: List[int]) -> int:
        n = len(prices)
        dp = [-float('inf')] * n
        cur = prices[-1]
        for i in range(n - 2,-1,-1):
            dp[i] = max(dp[i],cur)
            cur = max(cur,prices[i])
        ans = 0
        for i in range(n - 1):
            ans = max(ans,dp[i] - prices[i])
        return ans

