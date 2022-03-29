 class Solution {
    public int XXX(int[] nums, int target) {
        int n = nums.length, l = 0, r = n;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] >= target) r = mid;
            else l = mid + 1;
        }
        return r;
    }
}

