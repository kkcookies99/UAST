 class Solution {
    public int XXX(int[] nums) {
        int len=nums.length,max=nums[0];
        int[] dp=new int[len];
        dp[0]=nums[0];
        //dp[i]为结束下标为i的最大子序和
        for(int i=1;i<len;i++){
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            if(max<dp[i])   max=dp[i];
        }
        return max;
    }
}

