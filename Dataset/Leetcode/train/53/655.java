 class Solution {
    public int XXX(int[] nums) {
        int max = Integer.MIN_VALUE;
        int []dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i =1;i<nums.length;i++)
        {
            if(dp[i-1]>0)
                dp[i] = dp[i-1]+nums[i];
            else
                dp[i] = nums[i];
        }
        for(int i =0;i<dp.length;i++)
        {
            if(dp[i]>max)
                max = dp[i];
        }
        return max;
    }
}

