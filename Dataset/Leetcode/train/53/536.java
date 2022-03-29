 class Solution {
    public int XXX(int[] nums) {
        int dp[] = new int[nums.length];
        int max = 0;

        dp[0] = nums[0];
        max = dp[0];

        for(int i=1;i<dp.length;i++){
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
            max = Math.max(dp[i], max);
        }

        return max;
    }
}

