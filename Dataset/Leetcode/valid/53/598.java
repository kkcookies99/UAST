 class Solution {
    public int XXX(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
        }
        Arrays.sort(dp);
        return dp[dp.length-1];
    }
}

