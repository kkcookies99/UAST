 public int XXX(int[] prices) {
        int XXX = 0, minPrice = prices[0];
        for(int i = 1; i < prices.length; i ++){
            minPrice = Math.min(minPrice, prices[i - 1]);
            if(minPrice < prices[i]){
                XXX = Math.max(XXX, prices[i] - minPrice);
            }
        }
        return XXX;
    }

