 class Solution {
    public int XXX(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        dp[0] = nums[0];
        int max = nums[0];
        for(int i=0;i<n-1;i++){
            dp[i+1] = Math.max(nums[i+1],dp[i]+nums[i+1]);
            max = Math.max(dp[i+1],max);
        }
        return max;
    }
}

