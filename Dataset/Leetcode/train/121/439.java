 class Solution {
    public int XXX(int[] prices) {
        int maxpro = 0;
        for(int i = 0; i < prices.length-1; i++){
            for(int j = i +1; j < prices.length;j++){
                if(prices[i]-prices[j] < 0 && maxpro-(prices[j] - prices[i]) < 0){
                    maxpro = prices[j]-prices[i];
                }
                
            }
        }
        return maxpro;
    }
}

