class Solution {
    public boolean XXX(int[] nums) {
        int maxIndex = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i > maxIndex) {
                return false;
            }
            if (nums[i] + i > maxIndex) {
                maxIndex = nums[i] + i;
            }
        }
        return true;
    }
}

