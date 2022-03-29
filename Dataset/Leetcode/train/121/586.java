 class Solution {
    public int XXX(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i = 0; i<prices.length;i++){
            int sell=prices[i];
            if(sell - buy>0){
                if(profit<=sell-buy){               //判断是否有更小的buy值并重新赋予
                    profit = sell-buy;
                    buy = sell - profit;
                }
            }else{
                buy = sell;  
            }
        }
        return profit;
    }
}

