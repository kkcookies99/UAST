 class Solution {
    public int XXX(int[] prices) {
        int min = prices[0];
        int benefit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            benefit = Math.max(benefit, prices[i] - min);
        }
        return benefit;
    }
}

