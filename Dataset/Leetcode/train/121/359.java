 class Solution {
    public int XXX(int[] prices) {
       int[] dp=new int[prices.length];
       dp[0]=0;
       int maxVal=0;
       for(int i=1;i<prices.length;i++){
           dp[i]=Math.max(prices[i]-prices[i-1]+dp[i-1],0);
           maxVal=Math.max(maxVal,dp[i]);
       }
       return maxVal;
    }
}

