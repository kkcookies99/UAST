 class Solution {
    public int XXX(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public int binarySearch(int[] nums, int left, int right, int target) {
        if (left > right) {
            return left;
        }

        int mid = (left + right) / 2;

        if (nums[mid] > target) {
            return binarySearch(nums, left, mid - 1, target);
        } else if (nums[mid] < target) {
            return binarySearch(nums, mid + 1, right, target);
        } else {
            return mid;
        }
    }
}

