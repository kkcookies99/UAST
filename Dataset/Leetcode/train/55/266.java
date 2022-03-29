class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length==1) return true;
        //头节点就跳不了了
        if(nums[0]==0) return false;
        //dp[i]代表该位置下一次最大跳数
        int[] dp=new int[nums.length];
        //初始化
        dp[0]=nums[0];
        //最后一个位置不需要求
        for(int i=1;i<nums.length-1;i++){
            dp[i]=Math.max(dp[i-1]-1,nums[i]);
            //在跳期间，跳到了0的位置
            if(dp[i]<=0) return false;
        }
        return dp[nums.length-2]>0;
    }
}

