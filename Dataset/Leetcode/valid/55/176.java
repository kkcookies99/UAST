class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        dp[1] = nums[0] > 0 ? true : false;
        for(int i = 0;i<nums.length-1;i++){
            // dp[i+1] = (dp[i] && nums[i] > 0 ? true : false);
            if(dp[i] == true && nums[i] > 0){
                for(int j= 1;j<=nums[i] && i + j < nums.length ;j++){
                    dp[i+j] = true;
                }
            }else{
                dp[i] = false;
            }
        }
        return dp[nums.length-1];

    }
}

