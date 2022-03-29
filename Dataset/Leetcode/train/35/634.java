 class Solution {
    public int XXX(int[] nums, int target) {
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}

