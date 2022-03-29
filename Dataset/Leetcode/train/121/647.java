 class Solution {
    public int XXX(int[] prices) {
        int res=0,min=prices[0];
        for(int idx=1;idx<prices.length;idx++){
            res=Math.max(res, prices[idx]-min);
            min=Math.min(prices[idx],min);
        }
        return res;
    }
}

