 class Solution {
    public int XXX(int[] nums, int target) {
        if(nums == null || nums.length < 1){
            return 0;
        }
        int lo = 0;
        int hi = nums.length;
        while(lo < hi){
            int mid = lo + (hi - lo) / 2;
            if(nums[mid] < target){
                lo = mid + 1;
            }else {
                hi = mid;
            }
        }
        return hi;
    }
}

