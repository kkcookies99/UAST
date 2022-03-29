  public int XXX(int[] prices) {
        int max=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }else {
                max=Math.max(max,prices[i]-min);
            }
        }
        return max;
    }

