 class Solution {
    public int XXX(int[] nums) {
	int j = 0;
	for (int i = 1; i < nums.length; i++) {
		if (nums[i-1]==nums[i]) {
			j++;
		}else {
			nums[i-j] = nums[i];
		}
	}
	return nums.length-j;
    }
}

