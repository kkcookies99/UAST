public int XXX(int[] nums) {
		int ans = nums[0];
		for (int i = 1; i < nums.length; i++) {
			nums[i] += Math.max(nums[i - 1], 0);
			ans = Math.max(ans, nums[i]);
		}
		return ans;
	}

