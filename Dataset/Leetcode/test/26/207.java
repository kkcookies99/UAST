 class Solution {
    public int XXX(int[] nums) {
        if (null == nums || nums.length < 2) {
            return nums.length;
        }
        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                ++j;
            } else {
                nums[++i] = nums[j++];
            }
        }
        return ++i;
    }
}

