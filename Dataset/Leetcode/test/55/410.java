 class Solution {
    public boolean XXX(int[] nums) {
        boolean[]dp=new boolean[nums.length];
        dp[0]=true;
        //从0-i遍历，如果发现有nums[j]大于等于j和i之间的距离且nums[j]也可达，则表示nums[i]可达
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]>=i-j&&dp[j]==true){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[nums.length-1];
    }
}

