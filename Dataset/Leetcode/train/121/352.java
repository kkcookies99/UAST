     public int XXX(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for(int i = 1; i < prices.length; i++){
            int t = prices[i]-min;
            if(t>profit) profit = t;
            if(prices[i]<min) min = prices[i];
        }
        return profit;
    }

