 class Solution {
    public int XXX(int[] nums) {
        int n = nums.length;
        // dp[i] --->>> 以i为结尾的子序列中的最大和
        int[] dp = new int[n];
        dp[0] = nums[0];
        int res = dp[0];
        for ( int i = 1; i < n; i++ ) {
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i] );
            res = Math.max(dp[i], res);
        }
        return res;
    }
}

