 class Solution {
    public int XXX(int[] prices) {
        //更新最小值
        int minprice=Integer.MAX_VALUE;
        int len=prices.length;
        int res=0;
        minprice = Math.min(minprice,prices[0]);
        for(int i=1;i<len;i++){
            res = Math.max(res,prices[i]-minprice);
            minprice = Math.min(minprice,prices[i]);
        }
        return res;
}
}

