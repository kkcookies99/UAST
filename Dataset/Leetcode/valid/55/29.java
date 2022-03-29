class Solution {
    public boolean XXX(int[] nums) {
        if (nums.length == 1) {
		return true;
	}

	int lastNonZero = 0;
	boolean XXX;

	for (int i = 0; i < nums.length; i++) {
		XXX = false;
		if (nums[i] == 0 && i != nums.length - 1) {
			for (int j = lastNonZero; j < i; j++) {
				if (nums[j] > i - j) {
					lastNonZero = j;
					XXX = true;
					break;
				}
			}
			if (!XXX) {
				return false;
			}
		}
	}
		
	return true;
   }
}

