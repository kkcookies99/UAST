class Solution {
    public boolean XXX(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[dp.length - 1] = true;
        for (int i = dp.length - 2; i >= 0; i--){
            for (int j = i + 1; j < dp.length; j++){
                if (dp[j] && j - i <= nums[i]){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[0];
    }
}

