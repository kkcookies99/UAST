class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length==1){
            return true;
        }
        boolean[] dp=new boolean[nums.length];
        if(nums[0]!=0){
            dp[0]=true;
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<=nums[i];j++){
                if(i+j<nums.length){
                    dp[i+j]=dp[i];
                }
            }
        }
        return dp[nums.length-1];
    }
}

