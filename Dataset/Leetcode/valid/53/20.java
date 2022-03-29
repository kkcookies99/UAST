class Solution {
    public int XXX(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int res = Integer.MIN_VALUE;
        for(int i = 1; i < len; i++){
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            if(dp[i] > res){
                res = dp[i];
            }
        }
       return Math.max(dp[0], res);
    }
}

