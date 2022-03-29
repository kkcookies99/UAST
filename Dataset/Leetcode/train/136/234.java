 class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
		int res = 0;
		int len = nums.length;
		int i = 0;
		while(i<len-1) {
			if(nums[i] == nums[i+1]) {
				i = i+2;
			}
			else {
				res = nums[i];
				break;
			}
		}
		if(i == len-1) {
			res = nums[len-1];
		}
		return res;
    }
}

