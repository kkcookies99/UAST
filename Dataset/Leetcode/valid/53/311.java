class Solution {
    public int XXX(int[] nums) {
        int res=nums[0],len=nums.length;
        int[] dp=new int[len+1];
        for(int i=1;i<=len;++i){
            //dp[i]表示以i结尾的连续序列和的最大值
            dp[i]=Math.max(nums[i-1],dp[i-1]+nums[i-1]);
            res=Math.max(dp[i],res);
        }
        return res;
    }
}

