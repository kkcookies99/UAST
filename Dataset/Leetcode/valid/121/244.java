 class Solution {
    public int XXX(int[] prices) {
        int len = prices.length;
        //cos表示第i天前，包括第i天的最小价格
        int cos = prices[0];
        int res = prices[0] - cos;
        for (int i = 1; i < len; i++) {
            //计算cos
            cos = Math.min(cos,prices[i]);
            //计算最小利润
            res = Math.max(res,prices[i] - cos);
        }
        return res;
    }
}

