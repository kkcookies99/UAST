class Solution {
    public int XXX(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len+1];
        dp[0] = nums[0];
        int max = dp[0];

        for(int i=1; i<len; i++){
            if(dp[i-1]<0)
                dp[i] = nums[i];
            else
                dp[i] = dp[i-1] + nums[i];
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}