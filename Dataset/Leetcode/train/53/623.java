 class Solution {
    public int XXX(int[] nums) {
        int len = nums.length;

        int sum = nums[0];
        int max = sum;

        for (int i = 1; i < len; i++) {
            if (sum > 0) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }
            max = Math.max(max, sum);
        }

        return max;
    }
}

