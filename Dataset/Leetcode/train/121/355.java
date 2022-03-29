 class Solution {
    public int XXX(int[] prices) {
        int l = prices.length;
        int [][] dp = new int[l][2];
        for(int i = 0; i < l; i++){
            if(i == 0){
            dp[0][0] = 0;
            //dp[0][0] = Math.max(dp[i-1][0], dp[i-1][1] + price[i]);
            //dp[0][0] = Math.max(dp[i-1][0], dp[i-1][1] + price[i]);

            dp[0][1] = -prices[i];
            //dp[0][0] = Math.max(dp[i-1][2], dp[i-1][0] - price[i]);
            //dp[0][0] = Math.max(MIN.Integer, -price[i]);
            continue;
            }
          
           
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], -prices[i]);


        }

        return dp[l-1][0];
    }
}

