 class Solution(object):
    def XXX(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        res = 0
        mins = prices[0]
        for i in range(1,len(prices)):
            if prices[i] < mins:
                mins = prices[i]
            res = max(res, prices[i] - mins)
        if res > 0:
            return res
        else:
            return 0

