 class Solution {
    public int XXX(int[] prices) {
        int min=prices[0];
        int max=0;
        for(int i=1;i<prices.length;++i){
            if(prices[i]-min>max){
                max=prices[i]-min;
            }
            if(prices[i]<min){
                min=prices[i];
            }
        }
        return max;
    }
}

