 class Solution {
    public int XXX(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int pos = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                pos = mid + 1;
                l = mid + 1;
            } else {
                pos = mid;
                r = mid - 1;
            }
        }
        return pos;
    }
}

