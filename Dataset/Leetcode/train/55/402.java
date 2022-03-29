 class Solution {
    public boolean XXX(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int maxDisrance = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (maxDisrance >= i)
                maxDisrance = Math.max(i + nums[i], maxDisrance);
            if (maxDisrance >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}

