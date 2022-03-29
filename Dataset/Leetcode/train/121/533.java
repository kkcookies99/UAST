 public int XXX(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int buy=prices[0];
        int income=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>buy){
                income = Math.max(income,prices[i]-buy);
            }
            else{
                buy=prices[i];
            }
        }
        return income;
    }

