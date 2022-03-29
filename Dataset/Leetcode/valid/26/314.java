 class Solution {
    public int XXX(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return len;
        }
        int j = 0;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}

