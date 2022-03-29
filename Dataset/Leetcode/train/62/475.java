class Solution {
    public int XXX(int m, int n) {
        int[][] dp=new int[n][m];
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 if(i==0||j==0){
                     dp[i][j]=1;
                 }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                 }
            }
        }
        return dp[n-1][m-1];
    }
}

