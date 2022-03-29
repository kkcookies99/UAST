 class Solution {
    public int XXX(int[] prices) {
     int low = prices[0];
     int max = 0;
    for(int i = 0;i<prices.length;i++){
           low = Math.min(low,prices[i]);
           max = Math.max(max,prices[i]-low);
           }
        return max;
    }
}

