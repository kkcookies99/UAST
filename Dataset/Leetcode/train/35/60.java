 class Solution {
    public int XXX(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            // 如果中间值大于了target，那么我就要向左跑
            if (nums[mid] > target) {
                right = mid - 1;
                // 如果中间值小于了target，那么我就要向右跑
            } else if (nums[mid] < target) {
                left = mid + 1;
                // 如果相等，就直接返回mid
            } else {
                return mid;
            }
        }
        return left;
    }
}

