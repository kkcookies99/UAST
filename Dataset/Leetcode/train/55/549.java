 class Solution {
    public boolean XXX(int[] nums) {
        int len = nums.length;
        boolean[] dp = new boolean[len];
        dp[0]=true;
        for(int i=1;i<len;i++){
            for(int j=1;j<=i;j++){
                dp[i]=(nums[i-j]>=j)&& dp[i - j];
                if(dp[i]) break;
            }
        }
        return dp[len-1];
    }
}

