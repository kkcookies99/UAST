 class Solution(object):
    def XXX(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        #令dp[i]为第i天卖出股票的最大收益
        dp=[0]*len(prices)
        for i in range(1,len(prices)):
            dp[i]=dp[i-1]+prices[i]-prices[i-1]
            if dp[i]<0:
                dp[i]=0
        return max(dp)

