 class Solution {
    public boolean XXX(int[] nums) {
        int remindLength = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            remindLength = Math.max(remindLength - 1, nums[i]);
            if (remindLength < 1) return false;
        }
        return true;
    }
}

