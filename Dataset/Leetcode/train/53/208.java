class Solution {
    public int XXX(int[] nums) {
        int ans = nums[0], sum = nums[0];
	for(int i = 1; i < nums.length; i++){
	    sum = Math.max(nums[i], sum + nums[i]);
	    ans = Math.max(ans, sum);
	}
	return ans;
    }
}

