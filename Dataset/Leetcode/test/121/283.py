 class Solution:
    def XXX(self, prices: List[int]) -> int:
        le = len(prices)
        dp = [0]*le
        min_prices=prices[0]
        for i in range(1,le):
            dp[i] = max(dp[i-1],prices[i]-min_prices)
            min_prices=min(min_prices,prices[i])
        return dp[le-1]

