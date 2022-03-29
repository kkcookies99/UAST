  public int XXX(int[] prices) {
        int min=prices[0];
        int res=0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<min){
                min=prices[i];
            }
            res=(prices[i]-min)>res?(prices[i]-min):res;
        }
        return res;
    }

