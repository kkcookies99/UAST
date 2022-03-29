 class Solution:
    def XXX(self, prices: List[int]) -> int:
        i, j = 0, 1
        res = 0
        while i < len(prices) and j < len(prices):
            if prices[j] < prices[i]:
                i = j
                j += 1
            else:
                res = max(prices[j] - prices[i], res)
                j += 1
        return res 

