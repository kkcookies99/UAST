 class Solution {
    public int XXX(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int l = 0, r = nums.length - 1, result = -1;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            if(target == nums[mid]) {
                return mid;
            }
            else if(target < nums[mid]) {
                if(target >= nums[l]) {
                    r = mid - 1;
                }
                else {
                    return l;
                }
            }
            else if(target > nums[mid]) {
                if(target <= nums[r]) {
                    l = mid + 1;
                }
                else {
                    return r + 1;
                }
            }
        }
        return result;
    }
}

