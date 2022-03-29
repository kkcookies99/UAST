 class Solution {
    public int XXX(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        //左右指针
        int left = 0;
        int right = nums.length - 1;
        if (nums[right] < target) {
            return right + 1;
        }
        //二分
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target && nums[mid + 1] >= target) {
                return mid + 1;
            } else if (nums[mid] < target) {
                left = mid;
            } else {
                right = right - 1;
            }
            if (nums[mid] == target) {
                return mid;
            }
        }
        return left;
    }
}

