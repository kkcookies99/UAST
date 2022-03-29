 class Solution {
    public int XXX(int[] prices) {
        int res = -1;
        int beforeMin = prices[0];
        for(int i=0; i<prices.length; i++) {
            res = Math.max(res, prices[i] - beforeMin);
            beforeMin = Math.min(beforeMin, prices[i]);           
        }
        return res;
    }
}

