 class Solution:
    def XXX(self, prices: List[int]) -> int:
        mincost = 10**4+1
        maxprofit = 0
        for price in prices:
            if price <= mincost:
                mincost = price
            else:
                maxprofit = max(maxprofit, price-mincost)
        return maxprofit

