public boolean XXX(int[] nums) {
	int max = 0;
	for (int i = 0; i < nums.length-1; i++) {
		max = Math.max(i + nums[i], max);
		if (max <= i )
			return false;
	}
	return true;
}

