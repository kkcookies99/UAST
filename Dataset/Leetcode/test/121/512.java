 public int XXX(int[] prices) {
        if (prices.length <= 1) return 0;
        int ans = 0;
        // 记录左侧已出现中的最小值
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            // 选取最大的利润
            ans = Math.max(ans, prices[i] - min);
        }
        return ans;
    }

