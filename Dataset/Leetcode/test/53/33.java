class Solution {
    public int XXX(int[] nums) {
        int result = nums[0];
        int max = result;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] + result >= result) {
                if (result < 0) {
                    result = nums[i];
                } else {
                    result += nums[i];
                }
            } else {
                if (nums[i] + result >= 0) {
                    result += nums[i];
                } else {
                    result = nums[i];
                }
            }
            if (result > max) max = result;
        }
        return max;
    }
}

