 class Solution {
    public int XXX(int[] nums) {
        if (null == nums || nums.length == 1) return nums.length;
        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}

