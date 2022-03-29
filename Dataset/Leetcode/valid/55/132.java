class Solution {
    public boolean XXX(int[] nums) {
        boolean[] dp = new boolean[nums.length];

        dp[0] = true;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && j + nums[j] >= i){
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[dp.length - 1];
    }
}


