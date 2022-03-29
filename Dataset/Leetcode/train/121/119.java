 class Solution {
    public int XXX(int[] prices) {
        int r = 0;
        if(prices.length==1) return 0;
        int[] dp = new int[prices.length];
        dp[0] = prices[0];
        for(int i=1;i<prices.length;i++){
            dp[i] = Math.min(dp[i-1],prices[i]);
            r = Math.max(r,prices[i]-dp[i-1]);
        }
        return r;
    }
}

