 class Solution:
    def XXX(self, prices: List[int]) -> int:
        # 当前最大收益, 当前最小价格
        profit, price = 0, prices[0]
        for i in range(1, len(prices)):
            profit = max(prices[i] - price, profit)
            price = min(price, prices[i])
        return profit

