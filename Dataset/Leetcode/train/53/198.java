class Solution {
    public int XXX(int[] nums) {
        int[] dp = new int[nums.length+1];
        //dp[0] = 0;
        dp[0] = nums[0];
        int max=dp[0];
        for (int i=1;i<nums.length;i++) {
            
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
            max = Math.max(dp[i],max);
        }
        
        return max;
    }
}