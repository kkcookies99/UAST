 class Solution {
    public int XXX(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        if (nums[r] < target) return r + 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) l = mid + 1;
            else r = mid;
        }
        return r;
    }
}

