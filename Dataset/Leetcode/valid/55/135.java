class Solution {
    public boolean XXX(int[] nums) {
        int n = nums.length, reach = 0;
        for (int i = 0; i < n; ++i) {
            if (i > reach || reach >= n - 1) break;
            reach = Math.max(reach, i + nums[i]);
        }
        return reach >= n - 1;
    }
}

