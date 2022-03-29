 class Solution {
    public int XXX(int[] prices) {
        //dp[i][j] 表示股票i在第j天的最大利润
        int ans =0;
        int dp[][] =new int[prices.length][prices.length];
        for(int i=0;i<prices.length;i++)
        {
            for(int j=0;j<prices.length;j++)
            {
                if(i==j)
                {
                    dp[i][j]=0;
                }
            }
        }
        for(int i =0;i<prices.length;i++)
        {
            for(int j=i;j<prices.length;j++)
            {
                if(i!=j)
                {
                    dp[i][j] = prices[j]-prices[i];
                }
            ans = Math.max(dp[i][j],ans);
            }
        }
        return ans;
    }
}

