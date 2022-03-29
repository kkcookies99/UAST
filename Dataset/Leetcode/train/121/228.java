 class Solution {
    public int XXX(int[] prices) {
        int XXX = 0;
        int slow = 0;
        for (int fast = 1; fast < prices.length; fast++) {
            if(prices[fast] <= prices[slow]){
                slow = fast;
            }else {
                XXX = Math.max(XXX,prices[fast] - prices[slow]);
            }
        }
        return XXX;
    }
}

