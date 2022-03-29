     public int XXX(int[] prices) {
        int currMaxProfit = 0;
        for (int i = 0, j = 0; j < prices.length; j++) {
            if (prices[j] - prices[i] < 0) {
                i = j;
            } else {
                currMaxProfit = Math.max(prices[j] - prices[i], currMaxProfit);
            }
        }
        return currMaxProfit;
    }

