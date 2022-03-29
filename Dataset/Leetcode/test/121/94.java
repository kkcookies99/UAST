 class Solution {
    public int XXX(int[] prices) {
        int minpoint=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<=minpoint){
                minpoint=prices[i];
            }else{
                if(prices[i]>prices[i-1]){
                    maxprofit=prices[i]-minpoint;
                }
            }
        }
        return maxprofit;
    }
}

