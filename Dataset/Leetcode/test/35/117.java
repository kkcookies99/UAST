 class Solution {
    public int XXX(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left != right) {
            int mid = left + (right - left) / 2;
            if (target <= nums[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

