 class Solution {
    public int XXX(int[] prices) {
        int buy=prices[0],max=0;
        for(int i=1;i<prices.length;i++){
            buy=Math.min(buy,prices[i-1]);//更新买的最小值
            max=Math.max(max,prices[i]-buy);//更新最大利润为max和第i天卖的价格-前i-1天中的最小价格
        }
        return max;
    }
}

