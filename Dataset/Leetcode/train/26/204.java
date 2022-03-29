 class Solution {
    public int XXX(int[] nums) {
        if(nums.length < 2) return nums.length;
	int ans = 0;
	for(int i = 1; i < nums.length; i++){
	    if(nums[ans] != nums[i]){
		nums[++ans] = nums[i];
	    }
	}
	return ans+1;
    }
}

