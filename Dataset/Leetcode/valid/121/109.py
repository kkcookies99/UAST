 class Solution:
    def XXX(self, prices: List[int]) -> int:
        dp = [0]*len(prices)
        minprice = prices[0]
        for i in range(1, len(prices)):
            dp[i] = max(-minprice + prices[i], dp[i-1])
            minprice = min(minprice, prices[i])
        
        return dp[-1]

