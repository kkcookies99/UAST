 class Solution {
    public int XXX(int[] prices) {
        int len = prices.length;
        int[] dp = new int[len];
        int[] isHave = new int[len];
        isHave[0] = prices[0];
        for(int i=1;i<len;i++){
            isHave[i] = Math.min(prices[i],isHave[i-1]);
            dp[i] = Math.max(dp[i-1],prices[i] - isHave[i]);
        }

        return dp[len-1] > 0 ? dp[len-1] : 0;
    }
}

