 class Solution:
    def XXX(self, prices: List[int]) -> int:
        dp = [0]*len(prices)
        minval = prices[0]
        for i in range(1, len(prices)):
            if prices[i] < minval:
                dp[i] = dp[i-1]
                minval = prices[i]
            else:
                dp[i] = max(prices[i]-minval, dp[i-1])
        return dp[-1]

