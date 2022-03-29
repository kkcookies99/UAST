 class Solution:
    def XXX(self, prices: List[int]) -> int:
        n = len(prices)
        dp = [0]*n
        dp[0] = 0
        minPri = prices[0]
        for i in range(1,n):
            if prices[i] < minPri:
                minPri = prices[i]
            if prices[i] - minPri <= 0:
                dp[i] = 0
            else:
                dp[i] = prices[i] - minPri
        return max(dp)

