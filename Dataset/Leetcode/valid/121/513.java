 public int XXX(int[] prices) {
        int len = prices.length;
        if (len <= 1) return 0;
        int[] dp = new int[len];
        int min = prices[0];
        for (int i = 1; i < len; i++) {
            min = Math.min(min, prices[i]);
            dp[i] = Math.max(dp[i - 1], prices[i] - min);
        }
        return dp[len - 1];
    }

