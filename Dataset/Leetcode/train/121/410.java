 class Solution {
    public int XXX(int[] prices) {
        int tmp = 0;
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            tmp = Math.max(0, tmp + prices[i] - prices[i - 1]); // 当前区间的值为负的可以舍去这个区间，重置窗口
            max = Math.max(tmp, max);
        }
        return max;
    }
}

