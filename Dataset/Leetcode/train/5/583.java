 class Solution {
    public String XXX(String s) {
        int[] ans=new int[]{0,0};
        int[][] dp=new int[s.length()][s.length()];
        for(int i=dp.length-1;i>=0;i--){
            for(int j=i;j<dp.length;j++){
                if(i==j){
                    dp[i][j]=1;
                }
                else if(s.charAt(i)!=s.charAt(j)){
                    dp[i][j]=0;
                }
                else{
                    if(i+1==j){
                        dp[i][j]=2;
                    }
                    else{
                        dp[i][j]=dp[i+1][j-1]==0?0:dp[i+1][j-1]+2;
                    }
                }
                if(dp[i][j]>=ans[1]-ans[0]+1){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return s.substring(ans[0],ans[1]+1);
    }
}

