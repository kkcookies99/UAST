 class Solution {
    public int XXX(int[] prices) {
        int len = prices.length;
        int[] dp = new int[len];
        dp[0] = 0;
        int res = 0;
        for(int i = 1; i < len; i++){
            dp[i] = Math.max(dp[i - 1] + (prices[i] - prices[i - 1]), 0);
            res = Math.max(res, dp[i]);
        }
        return Math.max(dp[0], res);
    }
}

