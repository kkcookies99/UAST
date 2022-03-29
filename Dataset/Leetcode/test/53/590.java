 class Solution {
    public int XXX(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] < 0) {
                dp[i] = nums[i];
            } else {
                dp[i] = dp[i - 1] + nums[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int num : dp) {
            max = Math.max(max, num);
        }
        return max;
    }
}

