class Solution {
    public boolean XXX(int[] nums) {
        int m = nums.length;
        if (m == 0) return false;
        if (m == 1) return true;
        int max = nums[0];
        for (int i = 1; i < m; i++) {
            if (i <= max) {
                max = Math.max(nums[i] + i, max);
            }
        }
        return max >= m - 1;
    }
}

