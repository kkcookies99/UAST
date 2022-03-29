 class Solution {
    public boolean XXX(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i <= max) {
                if (max <= (nums[i] + i)) {
                    max = nums[i] + i;
                }
            }
        }
        return max >= nums.length - 1;
    }
}

