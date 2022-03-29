class Solution {
    public int XXX(int[] nums) {
        int n = nums.length;
        // dp[i]的含义为 以nums[i]为结尾的数组的最大的和
        // 初始化。每个值都是自己。
        int[] dp = nums;
        int res = dp[0];
        for (int i = 1; i < n; i++){
            dp[i] = Math.max(dp[i], dp[i-1]+ dp[i]);
            res = Math.max(res, dp[i]);
        }
        return res;

    }
}

