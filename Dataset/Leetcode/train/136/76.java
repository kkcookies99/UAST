 public int singleNumber(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int m = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					m++;
				}
			}
			if (m == 1) {
				return nums[i];
			}
		}
		return 0;
	}

