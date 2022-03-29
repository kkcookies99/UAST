 class Solution {
    public int XXX(int[] nums) {
        int n = nums.length;
        // dp[i] 表示 以nums[i] 结尾的连续子序列 最大和
        int[] dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1;i < n; i++){
            dp[i] = Math.max(nums[i],dp[i-1] + nums[i]);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}

