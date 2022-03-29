 class Solution(object):
    def XXX(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        left,res=prices[0],-1
        for i in range(1,len(prices)):
            res=max(res,prices[i]-left)
            left=min(left,prices[i])
        return max(0,res)

