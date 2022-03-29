 class Solution { // 动态规划解法
    public int XXX(int[] prices) {
        // 可交易次数
        int k = 1;
        // [天数][交易次数][是否持有股票]
        int[][][] dp = new int[prices.length][k + 1][2];

        // bad case
        dp[0][0][0] = 0;
        dp[0][0][1] = Integer.MIN_VALUE;
        dp[0][1][0] = Integer.MIN_VALUE;
        dp[0][1][1] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            for (int j = k; j >= 1; j--) {
                // dp公式
                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
            }
        }

        return dp[prices.length - 1][k][0] > 0 ? dp[prices.length - 1][k][0] : 0;
    }
}

