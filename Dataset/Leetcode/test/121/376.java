 class Solution {
    public int XXX(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int XXX = 0;
        for (int i = 0; i < prices.length; ++i) {
            min = Math.min(min, prices[i]);
            XXX = Math.max(XXX, prices[i] - min);
        }
        return XXX;
    }
}

