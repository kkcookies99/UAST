 class Solution {
    public int XXX(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n-1;
        int mid = r;
        while(l<=r){
            mid = l + (r - l)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else if(nums[mid] > target){
                r = mid - 1;
            }
        }
        return nums[mid] > target ? mid : mid + 1 ;
    }
}

