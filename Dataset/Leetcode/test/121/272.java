 class Solution {
    public int XXX(int[] prices) {
        int i = 0;
        int j = 1;
        int max = 0;
        while(j < prices.length){
            if(prices[i]<=prices[j]){
                if(max <= prices[j]-prices[i]){
                    max = prices[j]-prices[i];
                }
                ++j;
            }else{
                i = j; 
                ++j;
            }
        }
        return max;
    }
}

