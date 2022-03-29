 class Solution {
    public int XXX(int[] nums, int val) {
        int targetIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[targetIndex++] = nums[i];
            }
        }
        return targetIndex;
    }
}

