class Solution {
    public boolean XXX(int[] nums) {
        int step = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            step = Math.max(step, nums[i - 1] + i - 1);
            if (step < i) return false;
        }
        return true;
    }
}

