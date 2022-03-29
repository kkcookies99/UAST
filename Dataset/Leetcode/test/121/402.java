 class Solution {
    public int XXX(int[] prices) {
        int len = prices.length, store = 0;
        if(len < 2){
            return store;
        }

        int buy = 0, sale = 1;
        while(sale < len){
            if(prices[sale] < prices[buy]){
                buy = sale;
            }else{
                if(prices[sale] - prices[buy] > store){
                    store = prices[sale] - prices[buy];
                }
            }

            sale++;
        }
        return store;
    }
}

