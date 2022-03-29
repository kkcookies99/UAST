 class Solution {
    public int XXX(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int minPrice = prices[0];
        int maxEarn = 0;
        for (int i = 0; i < prices.length; i++) {
            maxEarn = Math.max(maxEarn, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxEarn;
    }
}

