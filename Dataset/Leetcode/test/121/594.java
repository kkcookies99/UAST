 class Solution {
    public int XXX(int[] prices) {
        int len = prices.length;
        // dp[i]表示到第i天的最大收益
        int[] dp = new int[len];
        int Minvalue = prices[0]; 
        for(int i = 1;i<len;i++){          
                dp[i] = Math.max(dp[i-1],prices[i]-Minvalue);  // 动态规划的迭代公式
                Minvalue = Math.min(Minvalue,prices[i]);          
        }
        
        return dp[len-1];
    }
}

