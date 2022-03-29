 class Solution {
    public int singleNumber(int[] nums) {
		Arrays.sort(nums);
		int target = 0;
		for (int i = 0; i <= nums.length - 1; i += 2) {
			if (i == nums.length - 1)
				target = nums[i];
			else {
				if (nums[i] != nums[i + 1]) {
					target = nums[i];
					break;
				}
			}
		}
		return target;
    }
}

