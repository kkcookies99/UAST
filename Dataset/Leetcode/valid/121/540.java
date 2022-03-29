 class Solution {
    public int XXX(int[] prices) {
        int minPrice = prices[0];
        int max = 0;
        for (int i=1; i<prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }
            max = Math.max(max,prices[i]-minPrice);
        }
        return max;
    }
}

