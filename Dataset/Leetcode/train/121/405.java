 class Solution {
    public int XXX(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int left = prices[0];  // 是数不是下标
        int left2 = left;
        int right = prices[1];
        int max = Math.max(right - left, 0);
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - left2 > max) {
                left = left2;
                right = prices[i];
                max = right - left;
            }
            if (prices[i] < left2) {  // 备用最小
                left2 = prices[i];
            }
        }
        return max;
    }
}

