 class Solution {
    public boolean XXX(int[] nums) {
      int size=nums.length;
      boolean[] dp=new boolean[size];
      dp[0]=true;
      for(int i=1;i<size;i++){
          for(int j=i-1;j>=0;j--){
              if(dp[j]==true&&nums[j]>=i-j){
                  dp[i]=true;
                  break;
              }
          }
      }
      return dp[size-1];
}
}

