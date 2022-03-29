 class Solution {
    public int XXX(int[] prices) {
        int len = prices.length;
        if (len == 1) return 0;
        // 动态规划 定义dp表示第i天获取的最大利润
        int[] dp = new int[len];
        dp[0] = 0;
        int min = prices[0];    // 记录前面的最小值
        for (int i = 1; i < len; i++) {
            if (prices[i] < min) {
                // 如果当前值更小 那此时收益最大的肯定是前一个 因为当前为负收益
                min = prices[i];
                dp[i] = dp[i - 1];
            } else {
                // 当前的值不是最小值 需要比较找一个最大值
                dp[i] = Math.max(prices[i] - min, dp[i - 1]);
            }   
        }
        return dp[len - 1];
    }
}

