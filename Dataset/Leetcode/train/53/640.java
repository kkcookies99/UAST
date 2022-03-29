 class Solution {
    public int XXX(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i=1;i<n;i++){
            dp[i] = dp[i-1]>0?dp[i-1]+nums[i]:nums[i];
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}

