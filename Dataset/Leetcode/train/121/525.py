 class Solution:
    def XXX(self, prices: List[int]) -> int:
        return max(accumulate((prices[i] - prices[i-1] for i in range(1, len(prices))), lambda a, b: max(a + b, 0), initial=0))

