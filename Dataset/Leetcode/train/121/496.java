 class Solution {
    public int XXX(int[] prices) {
        int res = prices[0];
        int max = 0;
        for(int i = 1;i < prices.length;i++){
            res = Math.min(res,prices[i]);
            max = Math.max(max,prices[i] - res);
        }
        return max;
    }
}

