 class Solution {
    public int XXX(int[] prices) {
        int t=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<t){
                t=prices[i];
            }else{
                if(prices[i]-t>max){
                    max=prices[i]-t;
                }
            }
        }
        return max;
    }
}
