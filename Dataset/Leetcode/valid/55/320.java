class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length == 1) return true;
        if(nums[0] == 0) return false;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1;i<nums.length-1;i++){
            dp[i] = Math.max(dp[i-1]-1,nums[i]);
            if(dp[i] == 0)
                return false;
        }
        return true;
    }
}

