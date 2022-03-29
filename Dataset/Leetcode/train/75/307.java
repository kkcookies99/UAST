class Solution {
    public void XXX(int[] nums) {  
        int[] counts = { 0, 0, 0 };
		for (int n : nums) {
			counts[n]++;
		}
		int index = 0;
		for (int i = 0; i < counts.length; i++) {
			for (int j = 1; j <= counts[i]; j++) {
                              nums[index++] = i;
			}
		}
    }
}

