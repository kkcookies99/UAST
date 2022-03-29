 class Solution:
    def XXX(self, prices: List[int]) -> int:
        if len(prices) <= 1:
            return 0
        lo, hi, maxv = 0, 1, 0
        while hi < len(prices):
            if prices[hi] - prices[lo] >= 0:
                maxv = max(maxv, prices[hi] - prices[lo])
                hi += 1
            else:
                lo = hi
        return maxv

