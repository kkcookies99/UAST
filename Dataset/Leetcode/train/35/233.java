 class Solution {
    public int XXX(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        if(target > nums[r]){
            return r+1;
        }
        if(target <= nums[0]){
            return 0;
        }
        while(l < r){
            int mid = (l + r) / 2;
            if(nums[mid] >= target){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}

