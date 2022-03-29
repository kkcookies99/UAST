class Solution {
    public int XXX(int[] nums) {
        //滑窗
        //最大和
        int sum=nums[0];
        //当前时刻的一个最大连续子数组。
        int []dp=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            dp[i]=Math.max(nums[i],dp[i-1]+nums[i]);
            sum=Math.max(sum,dp[i]);
        }
        return sum;
    }
}

