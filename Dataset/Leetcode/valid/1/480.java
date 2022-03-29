 class Solution {
	public int[] XXX(int[] nums, int target) {

		int nl = nums.length;
		for (int i = 0; i < nl; i++) {
			for (int j = i + 1; j < nl; j++) {
				if (target == nums[i] + nums[j]) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};

	}
}


