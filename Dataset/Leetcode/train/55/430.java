 class Solution {
    public boolean XXX(int[] nums) {
        int maxIndex = 0;
        for (int i = 0; i <= maxIndex; i++) {
            maxIndex = Math.max(maxIndex, i + nums[i]);
            if (maxIndex >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}

