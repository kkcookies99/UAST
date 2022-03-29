 class Solution {
    public int XXX(int[] prices) {
        int len = prices.length;
        if (len <= 1) return 0;
        int max = 0, min = prices[0];
        for (int i = 1; i < len; i++){
            if (prices[i] < min) min = prices[i];
            else max = Math.max(max, prices[i] - min);
        }
        return max;
    }
}

