 class Solution {
    public int XXX(int[] prices) {
        int n=prices.length;
        if(n==0 || prices == null) return 0;
        int[][] dp = new int[n][2];
        //0是持有。1是不持有
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for(int i=1;i<n;i++) {
            dp[i][0] = Math.max(dp[i-1][0],-prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],prices[i]+dp[i-1][0]);
        }
        return dp[n-1][1];
    }
}

