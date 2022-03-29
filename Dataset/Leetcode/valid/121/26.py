 class Solution:
    def XXX(self, prices: List[int]) -> int:
        profit = 0
        buy_price = prices[0]
        for i in range(1, len(prices)):
            if buy_price <= prices[i]:
                profit = max(profit, prices[i] - buy_price)
            else:
                buy_price = prices[i]
        
        return profit

