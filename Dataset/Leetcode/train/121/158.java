 public int XXX(int[] prices) {
    int mp = 0, max = 0;

    /* 找出i之前最小的数字，当前做差 */
    for (int i = 1, l = prices.length; i < l; i++) {
        mp = prices[i - 1] < prices[mp] ? i - 1 : mp;
        max = Math.max(max, prices[i] - prices[mp]);
    }

    return max;
}
