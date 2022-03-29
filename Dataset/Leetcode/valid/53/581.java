 class Solution {
    public int XXX(int[] nums) {
        int n=nums.length,max = nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        for(int i=1;i<n;i++) {
            dp[i] = nums[i] + (dp[i-1]>0?dp[i-1]:0);
            max = Math.max(dp[i],max);
        }return max;
    } 
}

