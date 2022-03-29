 class Solution {
    public int XXX(int[] prices) {
        if(prices.length == 1) return 0;
        int dp = 0;
        int num = 0;
        for(int i =1; i<prices.length; i++){
            dp = Math.max(dp,prices[i]-prices[num]);
            if(prices[i]<prices[num]){
                num = i;
            }
        }
        return dp;
    }
}

