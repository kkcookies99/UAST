 class Solution {
    public int XXX(int[] prices) {
        // dp[i]表示第i天卖出时的最大收益.如果计算出来的为负数，则置为0.
        int dp[] = new int[prices.length];
        int ret = 0;
        for (int i = 1; i < prices.length; i++) {
            // 如果dp[i - 1] + prices[i] - prices[i - 1]小于0，则表示price[i]是最低价格了，下一天则以这个价格建仓。
            dp[i] = Math.max(0, dp[i - 1] + prices[i] - prices[i - 1]);
            ret = Math.max(ret, dp[i]);
        }
        return ret;
    }
}

