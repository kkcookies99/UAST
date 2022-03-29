 class Solution:
    def XXX(self, prices: List[int]) -> int:
        """
        main
        # 只有一次买入卖出
        # dp_i_0 状态是未持有股票
        # dp_i_1 状态是持有股票
        """
        n = len(prices)
        dp_i_0 = 0
        dp_i_1 = -float('inf')
        for i in range(n):
            # 未持有股票的原因：上次操作把股票卖了或者维持现状
            dp_i_0 = max(dp_i_0, dp_i_1 + prices[i])
            # 持有股票的原因： 上次操作买入的股票或者维持现状
            dp_i_1 = max(dp_i_1, -prices[i])
        return dp_i_0  

