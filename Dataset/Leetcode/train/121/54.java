 class Solution {
    public int XXX(int[] prices) {
        int minPrice = prices[0];
        int maxPrice = prices[0];
        int aMaxProfit = 0;
        for(int i = 0;i<prices.length;i++){
            if(prices[i]>maxPrice){
                maxPrice = prices[i];
                aMaxProfit = aMaxProfit>maxPrice - minPrice?aMaxProfit:maxPrice - minPrice;
            }
            else if(prices[i]>minPrice){
                continue;
            }
            else if(prices[i]<minPrice){
                minPrice = prices[i];
                maxPrice = prices[i];
            }
        }
        return aMaxProfit;
    }
}

