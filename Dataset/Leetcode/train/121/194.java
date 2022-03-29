 class Solution {
    public int XXX(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int currMinPrice = prices[0];
        int XXX = 0;
        int currProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < currMinPrice){
                currMinPrice = prices[i];
            }
            currProfit = prices[i] - currMinPrice;
            if(currProfit > XXX){
                XXX = currProfit;
            }
        }
        return XXX;
    }
}
