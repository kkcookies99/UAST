 class Solution:
    def XXX(self, prices: List[int]) -> int:
        dp = [0] * len(prices)
        buy_price = prices[0]
        for i in range(1, len(prices)):
            dp[i] = max(dp[i-1], prices[i] - buy_price)
            buy_price = min(buy_price, prices[i])
        return dp[-1]

