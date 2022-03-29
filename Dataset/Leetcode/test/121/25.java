 class Solution {
    public int XXX(int[] prices) {
        // 返回的结果，默认值0
        int res = 0;
        int minCost = prices[0];

        for (int price: prices) {
            res = Math.max(res, price - minCost);
            minCost = Math.min(minCost,price);
        }

        return res;
    }
}

