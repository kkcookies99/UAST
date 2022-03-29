 class Solution {
    public int XXX(int[] nums) {
        int ret = nums.length;
        for (int i = 1; i < ret; i++) {
            if (nums[i] == nums[i - 1]) {
                for (int j = i; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
                ret--;
                i--;
            }
        }
        return ret;
    }
}

