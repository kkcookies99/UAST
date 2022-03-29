 public int XXX(int[] prices) {
    int margin = 0, curSum = 0;

    for (int i = 1; i < prices.length; i++) {
      int diff = prices[i] - prices[i - 1];
      curSum = curSum >= 0 ? curSum + diff : diff;

      margin = Math.max(margin, curSum);
    }

    return margin;
}

