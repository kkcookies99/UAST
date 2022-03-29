class Solution {
    public boolean XXX(int[] nums) {
        /*
           dp：
            1.dp[i]:下标i(包括)之前最远能走多远
            2.状态方程:
                dp[i]=Math.max(dp[i-1],i+nums[i]);(i<=dp[i-1])
            3.初始值:
                dp[0]=nums[0];
            进阶:
                观察dp[i]=Math.max(dp[i-1],i+nums[i]);(i<=dp[i-1]),可知只需要一个记录量
        */
        int len=nums.length;
        if(len<=0) return false;
        int p;
        p=nums[0];
        for(int i=1;i<=Math.min(p,len-1);i++){
            p=Math.max(p,i+nums[i]);
        }
        return p>=len-1;
    }
}

