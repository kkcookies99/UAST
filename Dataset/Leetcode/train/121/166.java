 class Solution {
    public int XXX(int[] prices) {
        int min = prices[0],ans = 0;
        for(int i = 1;i<prices.length;i++){
            min = Math.min(prices[i],min);
            ans = Math.max(prices[i]-min,ans);
        }
        return ans;
    }
}