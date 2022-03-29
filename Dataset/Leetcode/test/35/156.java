 class Solution {
    public int XXX(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return len;
    }
}

