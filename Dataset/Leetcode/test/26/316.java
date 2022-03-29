 class Solution {
    public int XXX(int[] nums) {
        if (nums == null) {
		return 0;
	}
	if (nums.length <= 1) {
		return nums.length;
	}
		
	int cur = 0;
	for (int i = 1; i < nums.length; i++) {
		if (nums[i] != nums[cur]) {
			nums[cur + 1] = nums[i];
			cur++;
		}
	}
	return cur + 1;
    }
}

