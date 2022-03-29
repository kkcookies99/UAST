 public int XXX(int[] prices) {
        int min=prices[0];//最佳的买入时机
        int profit=0;
        for(int i=1;i<prices.length;i++){
            profit=Math.max(profit,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return profit;
    }

