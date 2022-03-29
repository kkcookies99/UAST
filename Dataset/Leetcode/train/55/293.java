class Solution {
    public boolean XXX(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return true;
        }
        int[] nums2 = new int[len];  // 判断能否到达，能到达为1
        nums2[0] = 1;
        for (int i = 0; i < len - 1; i++) {
            if (nums2[i] == 1) {
                for (int j = 1; j <= nums[i]; j++) {
                    if (i + j < len) {
                        nums2[i + j] = 1;
                    }
                }
            }
        }
        return nums2[len - 1] == 1;
    }
}

