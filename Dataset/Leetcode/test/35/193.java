 class Solution {
    public int XXX(int[] nums, int target) {
        int l = 0, r = nums.length-1, mid = 0;
	while(l <= r){
	    mid = (l+r) >> 1;
	    if(nums[mid] < target){
		l = mid + 1;
	    }else if(nums[mid] > target){
		r = mid - 1;
	    }else return mid;
	}
	return nums[mid] < target ? l : mid;
    }
}

