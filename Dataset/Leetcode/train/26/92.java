 class Solution {
    public int XXX(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int fast=1, slow = 0;
        while (fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                nums[slow+1] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow+1;
    }
}

