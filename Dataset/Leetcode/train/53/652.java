 class Solution {
    public int XXX(int[] nums) {
        int l = nums.length;
        int[] dp = new int[l + 1];
        dp[0] = nums[0];
        int res = dp[0];
        for(int i = 1;i < l;i++){
            if(dp[i-1]<0){
                dp[i] = nums[i];
            }else dp[i] = nums[i]+dp[i-1];
            res = Math.max(res,dp[i]);
        }
        return res;

    }
}

