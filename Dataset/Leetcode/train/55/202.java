class Solution {
    public boolean XXX(int[] nums) {
        int max = nums[0];
        for (int i = 0; i <= max; i++) {
            max = Math.max(i + nums[i], max);
            if (max >= nums.length - 1) {
                return true;
            }
        }
        return max >= nums.length - 1;
    }
}

