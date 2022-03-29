 class Solution:
    def XXX(self, prices: List[int]) -> int:
        length = len(prices)
        dp = [0] * length
        minKey = prices[0]
        for i in range(1, length):
            if prices[i] < minKey: minKey = prices[i]
            if prices[i] < minKey:
                continue
            else:
                dp[i] = max(dp[i - 1], prices[i] - minKey)
        return max(dp)

