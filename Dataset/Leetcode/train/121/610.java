 class Solution {
    public int XXX(int[] prices) {
        if(prices.length<=1) return 0;
        int max=0;
        int []dp=new int[prices.length];
        dp[0]=prices[0];
        for(int i=1;i<prices.length;i++){
            max=Math.max(prices[i]-dp[i-1],max);
            dp[i]=Math.min(dp[i-1],prices[i]);
        }
        return max;
    }
 }

