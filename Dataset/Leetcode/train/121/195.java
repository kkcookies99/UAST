 public int XXX(int[] prices) {
        int profit = 0;
        if (prices != null && prices.length > 0) {
            int min = prices[0];
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < min) {
                    min = prices[i];
                } else {
                    int temp = prices[i] - min;
                    profit = Math.max(profit, temp);
                }
            }
        }
        return profit;
    }

