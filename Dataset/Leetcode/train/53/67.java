class Solution {
    public int XXX(int[] nums) {
        if(nums.length<=0) return 0;
        //dp[i]：以数组nums[i]为结尾的最大数组和。
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = dp[0];
        for(int i=1;i<nums.length;i++){
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}

