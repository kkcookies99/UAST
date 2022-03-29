 class Solution {
    public int XXX(int[] nums, int target) {
        int n = nums.length;
        int left = 0,right = n-1;
        if(target>nums[nums.length-1]) return nums.length;
        while(left < right){
            int mid = left + (right-left)/2;
            if(target < nums[mid]){
                right = mid;
            }
            else if(target > nums[mid]){
                left = mid + 1;
            }
            else if(target == nums[mid]){
                left = mid;
                return left;
            }
        }
        return left;
    }
}

