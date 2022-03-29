 public int XXX(int[] prices) {
        //dp[i]表示截止到i，价格的最低点是多少   dp[i]=min(dp[i-1],nums[i])
        int max = 0;
        int[] dp = new int[prices.length];
        dp[0] = prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i]=Math.min(dp[i-1],prices[i]);
            max=Math.max(prices[i]-dp[i],max);
        }
        return max;
    }

