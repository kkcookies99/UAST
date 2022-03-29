 public int XXX(int[] nums) {
	int max = Integer.MIN_VALUE;
	for(int i = 0; i < nums.length; i++) {
		int sum = nums[i];
		max = Math.max(max, sum);
		for(int j = i + 1; j < nums.length; j++) {
			sum += nums[j];
			max = Math.max(max, sum);
		}
	}
	return max;
}

