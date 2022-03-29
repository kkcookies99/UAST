 public int XXX(int[] prices) {
        int dp = 0, min = prices[0];
        for(int i = 1; i < prices.length; ++i){
            min = Math.min(min, prices[i]);
            dp = Math.max(dp, prices[i] - min);
        }
        return dp;
    }

