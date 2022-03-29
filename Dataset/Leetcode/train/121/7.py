 class Solution:
    def XXX(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        min_p, max_p = 999999, 0
        for i in range(len(prices)):
            min_p = min(min_p, prices[i])
            max_p = max(max_p, prices[i] - min_p)
        return max_p

