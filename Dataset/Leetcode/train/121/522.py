 class Solution:
    def XXX(self, prices: List[int]) -> int:
        dp0, dp1 = 0, -prices[0]
        for i in range(1, len(prices)):
            dp0 = max(dp0, dp1 + prices[i])
            dp1 = max(dp1,  -prices[i])
        return dp0

