 class Solution {
    public int XXX(int[] prices) {
        if (prices.length <= 1) return 0;
        int max = 0;
        int count = 0;
        for (int i = 1; i < prices.length; i++) {
            int sub = prices[i] - prices[i-1];
            if (count < 0) count = sub;
            else count += sub;
            max = Math.max(max, count);
        }
        return max;
    }
}

