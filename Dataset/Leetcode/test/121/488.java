 class Solution {
    public int XXX(int[] prices) {
        int len = prices.length;

        //base case
        int dp0 = 0;
        int dp1 = -prices[0];

        //状态转移
        for (int i = 1; i < len; i++) {
            dp0 = Math.max(dp0, dp1 + prices[i]);
            dp1 = Math.max(dp1,  -prices[i]);
        }

        return dp0;
    }
}

