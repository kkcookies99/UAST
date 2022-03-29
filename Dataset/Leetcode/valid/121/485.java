 class Solution {
    public int XXX(int[] prices) {
        int len = prices.length;

        // dp[i][0] 表示第i天，不持有股票获得的最大收益（允许交易一次）
        // dp[i][1] 表示第i天，持有股票获得的最大收益
        int[][] dp = new int[len][2];

        // base case
        // 第0天不持有股票所能获得的最大利润
        dp[0][0] = 0;
        // 第0天持有股票所能获得的最大利润
        dp[0][1] = -prices[0];

        // 状态转移
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1],  -prices[i]);
        }

        // 肯定是不持有股票时利润最大
        return dp[len - 1][0];
    }
}

