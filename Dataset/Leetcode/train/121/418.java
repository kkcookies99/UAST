 class Solution {
    public int XXX(int[] prices) {
        int len = prices.length;
        if(len < 2){
            return 0;
        }
        int min = prices[0];
        int profit = 0;
        for(int i = 1;i<len;i++){
            if(prices[i] > min){
                profit = Math.max(prices[i] - min,profit);
            }else{
                min = prices[i];
            }
        }
        return profit;
    }
}

