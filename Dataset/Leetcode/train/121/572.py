 class Solution:
    def XXX(self, prices: List[int]) -> int:
        cost, profit = -float("inf"), 0
        for p in prices:
            cost = max(cost, 0 - p)
            profit = max(profit, cost + p)
        return profit

