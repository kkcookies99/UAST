 class Solution {
    public int XXX(int[] prices) {
        int n = prices.length;
        int minn = 0;
        int maxx = 0;
        int ret = Integer.MIN_VALUE;
        for(int i = 1; i < n; i++){
            if(prices[i] <= prices[minn]){
                minn = i;
                maxx = i;
                continue;
            }
            if(prices[i] > prices[maxx]){
                maxx = i;
                ret = Math.max(prices[i]-prices[minn], ret);
            }
        }
        return ret==Integer.MIN_VALUE?0:ret;
    }
}

