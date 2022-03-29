 class Solution(object):
    def XXX(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        diff = max(prices) - prices[0]
        index = prices[0]
        for i in range(0, len(prices)-1):
            if prices[i]>=index:
                continue
            elif (prices[i] == prices[i+1]):
                continue
            elif (max(prices[i+1:])-prices[i])>diff:
                index = prices[i]
                diff = max(prices[i+1:])-prices[i]
            else:
                continue
        return diff
