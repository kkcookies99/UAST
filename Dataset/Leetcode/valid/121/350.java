 class Solution {
    public int XXX(int[] prices) {
        if(prices == null || prices.length < 2)
            return 0;
        int min = prices[0];
        int pro = prices[1] - min;
        for(int i = 1; i < prices.length; i++){
            min = Math.min(min, prices[i]);
            pro = Math.max(pro, prices[i]-min);
        }
        return pro;
    }
}

