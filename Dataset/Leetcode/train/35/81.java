 class Solution {
    public int XXX(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = (left + right) >> 1;
            if (nums[mid] > target) {
                if (0 == mid) return 0;
                right = mid;
            } else if (nums[mid] < target) {
                if (mid == left) {
                    if (nums[right] >= target) return right;
                    else return right + 1;
                }
                left = mid;
            } else return mid;
        }
        return left;
    }
}

