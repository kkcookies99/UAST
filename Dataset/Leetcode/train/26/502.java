 class Solution {
    public int XXX(int[] nums) {
        if (nums.length < 2) return nums.length;

        int resLen = 1;
        int currentNum = nums[0];
        for (int i = 0; i < nums.length; i ++) {
            if (currentNum != nums[i]) {
                nums[resLen ++] = nums[i];
                currentNum = nums[i];
            }
        }

        return resLen;
    }
}
