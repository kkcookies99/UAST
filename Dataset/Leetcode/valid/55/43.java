class Solution {
    public boolean XXX(int[] nums) {
        boolean []dp=new boolean[nums.length];
        dp[0]=true;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&(i-j)<=nums[j]){
                    dp[i]=true;
                }
            }
        }
        return dp[nums.length-1];
    }
}

