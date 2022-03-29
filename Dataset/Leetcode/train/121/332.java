 public int XXX(int[] prices) {
        int max = 0;
        int minPrice=prices[0];
        for (int i = 1; i < prices.length; i++) {
            minPrice=Math.min(prices[i],minPrice);
            max=Math.max(prices[i]-minPrice,max);
        }
        
        return max;
    }

