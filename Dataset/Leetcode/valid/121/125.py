 class Solution:
    def XXX(self, prices: List[int]) -> int:
        dp=[[0,0] for i in range(len(prices))] #代表了两个状态，为0时候代表持有股票（持有股票可以今天买也可以之前买）时候的当前最大现金，为1的时候代表当前未持有的最大现金
        dp[0][0]=-prices[0];dp[0][1]=0 #初始化 第0天时候，持有只有买入，卖出的时候收益为0
        for i in range(1,len(prices)):
            dp[i][0]=max(dp[i-1][0],-prices[i]) #第i天可以继续保持持有状态，或者在今天买进，取最大值
            dp[i][1]=max(dp[i-1][1],dp[i-1][0]+prices[i]) #第i天可以继续保持未持有状态，或者在今天卖出，取最大值
        return dp[len(prices)-1][1]

