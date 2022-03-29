 class Solution {
    public int singleNumber(int[] nums) {

        int len=nums.length;
		if(len==1)return nums[0];

		int res=nums[0];
		for (int i = 1; i <nums.length; i++) {
			res^=nums[i];
		}
		return res;
    }
}

