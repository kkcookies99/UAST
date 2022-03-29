 public int XXX(int[] prices) {
        int max = 0;
        int price = prices[0];
        for(int i=1; i<prices.length; i++){
            if(prices[i]-price>max){
                max = prices[i] - price; 
            }else{
                if(prices[i]<price) price = prices[i];
            }
        }
        return max;
    }

