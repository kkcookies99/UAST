 class Solution {
    public int XXX(int[] nums) {
        int len = 0;
	if(nums==null)
		return 0;
	if(nums.length==1)
		return 1;
	for(int i=1;i<nums.length;i++){
	    if(nums[i]>nums[len]){
		len++;
		nums[len] = nums[i];
	    }
	}
	return len+1;
    }
}

