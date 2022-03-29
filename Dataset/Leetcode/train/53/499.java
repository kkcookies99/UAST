 class Solution {
    public int XXX(int[] nums) {
        int len=nums.length;
        int[] dp=new int[len];
        dp[0]=nums[0];
        for (int i = 1; i < len; i++) {
            dp[i]=Math.max(0,dp[i-1])+nums[i];
        }
        int res=Integer.MIN_VALUE;
        for (int i = 0; i <dp.length; i++) {
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}

