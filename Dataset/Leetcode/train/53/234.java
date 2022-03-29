class Solution {
    public int XXX(int[] nums) {
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        int ret=dp[0];
        for(int i=1;i<nums.length;i++){
            dp[i] = dp[i-1]>=0? dp[i-1]+nums[i] : nums[i];
            ret=Math.max(dp[i],ret);
        }

        return ret;
    }
}```
