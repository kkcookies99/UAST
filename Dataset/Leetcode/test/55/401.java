 class Solution {
    public boolean XXX(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i ++){
            if(dp[i - 1] == 0){
                return false;
            }
            dp[i] = Math.max(nums[i], dp[i - 1] - 1);
            
        }

        return true;
    }
}

