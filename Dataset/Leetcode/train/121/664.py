 class Solution:
    def XXX(self, prices: List[int]) -> int:
        if(len(prices)<=1):
            return 0
        maxprices = 0
        mindex = 0
        maxdex = 0
        for i in range(1,len(prices)):
            dexprices = prices[i]-prices[mindex]
            if(maxprices<dexprices):
                maxprices = dexprices
            elif prices[mindex]>prices[i]:
                mindex = i
        return maxprices

