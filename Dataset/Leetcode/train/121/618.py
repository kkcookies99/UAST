 class Solution:
    def XXX(self, prices: List[int]) -> int:
        maxf, minv = 0, prices[0]
        for i in range(1,len(prices)):
            if prices[i] < minv:
                minv = prices[i]
            maxf = max(prices[i] - minv, maxf)
        return maxf

