 public int XXX(int[] prices) {
	int max = Integer.MIN_VALUE;
	int si = prices[0];
	for (int i = 1; i < prices.length; i++) {
		si = prices[i] - si;
		max = Math.max(si, max);
		if (si < 0)
			si = prices[i];
		else
			si = prices[i] - si;

	}
	if (max < 0) max = 0;
	return max;
} 

