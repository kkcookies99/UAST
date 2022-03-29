 class Solution {
    public int XXX(int[] prices) {
        int pre = prices[0], max = 0;
        for (int i = 0; i < prices.length; i++) {
            pre = Math.min(pre, prices[i]);
            max = Math.max(max, prices[i] - pre);
        }
        return max;
    }
}

