 class Solution {
    public int XXX(int[] nums, int val) {
        int i = -1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
}

