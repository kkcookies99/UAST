 class Solution {
    public int XXX(int[] prices) {
    	int[] dp = new int[prices.length];

    	int max = 0;
    	dp[0] = 0;
    	for (int i = 1; i < prices.length; i++) {
    		if (prices[i] >= prices[i-1]) dp[i] = dp[i-1] + prices[i] - prices[i-1];
    		else if (prices[i] < prices[i-1]) {
    			if (prices[i] <= prices[i-1]-dp[i-1]) dp[i] = 0;
    			else dp[i] = prices[i] - (prices[i-1] - dp[i-1]);
			}
    		max = Math.max(dp[i], max);
		}

    	return max;
    }
}

