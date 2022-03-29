 class Solution {
    public int XXX(int[] prices) {
        int profit = 0;
        int res = 0;
        for(int i = 1; i<prices.length; i++){
            for(int j = 0; j< i; j++){
                 profit = prices[i] - prices[j];
                res = Math.max(profit, res);
            }
        }
        return res;
    }
}

