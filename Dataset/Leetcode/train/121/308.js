 var XXX = function(prices) {
    /**
     * dp[i][j] 表示第i天持股/不持股的最大金钱数
     * j = 0表示持有股票 j = 1表示不持有股票
     * 本金是固定的，所以设置为多少都不重要 可以假设它为0
     */

    /**
     * 持股状态
     *  如果是第i天买入 那么就是dp[i][0] = 0 - prices[i] = -prices[i]
     *  如果是第i天前就已经买入 那么就是dp[i-1][0]
     */
    
    /**
     * 不持股状态
     *  第i天才把股票卖出去 所以最大金钱数就是第i天前持股的钱 + 今天卖出股票的钱 dp[i][1] = dp[i-1][0] + prices[i]
     *  如果是第i天前就已经卖出 那么就是dp[i-1][1]
     */

    /**
     * 初始化dp数组
     * 不持股状态：第一天不可能卖股票 所以就是啥也没干 本金0不变
     * 持股状态：第一天买了股票 所以本金为 -prices[0]
     */

     const dp = new Array(prices.length).fill([0, 0]);
     
     dp[0][0] = -prices[0]
     dp[0][1] = 0

     for(let i = 1; i < prices.length; i++ ){
         dp[i][0] =  Math.max(dp[i-1][0], -prices[i]);
         dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0]+prices[i]);
     }
     return dp[prices.length-1][1];
};

