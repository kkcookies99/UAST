 class Solution(object):
    def XXX(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        maxprofit=0
        if len(prices)==0 or len(prices)==1:
            return 0
        if len(prices)==2:
            maxprofit=prices[1]-prices[0]
        min_p=prices[0]
        for i in range(1,len(prices)):
            #maxprofit=max(max(prices[i:])-min(prices[:i]),maxprofit)
            min_p=min(min_p,prices[i])
            maxprofit=max(maxprofit,prices[i]-min_p)

        return maxprofit if maxprofit>0 else 0


