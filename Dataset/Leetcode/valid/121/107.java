     public int XXX(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int max = 0;
        int minPrices = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= minPrices) {
                minPrices = prices[i];
            } else if (prices[i] - minPrices > max) {
                max = prices[i] - minPrices;
            }
        }
        return max;
    }

