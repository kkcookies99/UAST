 class Solution {
    public boolean XXX(int[] nums) {
        int n = nums.length;
        int end = 0;
        for (int i = 0; i < n; i++) {
            if (i <= end ) {
                end = Math.max(i + nums[i], end);
            }
        }
        return end >= n - 1;
    }
}

