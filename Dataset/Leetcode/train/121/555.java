 public int XXX(int[] prices) {
    int minVal = prices[0];
    int minIndex = 0;
    // 找到最小值位置
    int result = 0;
    for (int i  = 1; i < prices.length; i++) {
        if (minVal > prices[i]) {
            minIndex = i;
            minVal = prices[i];
        }
        if (result < prices[i] - minVal) {
            result = prices[i] - minVal;
        }
    }
    int maxVal = prices[minIndex];
    for (int i  = minIndex + 1; i < prices.length; i++) {
        if (maxVal < prices[i]) {
            maxVal = prices[i];
        }
        if (result < maxVal - minVal) {
            result = maxVal - minVal;
        }
    }
    return result;
}
