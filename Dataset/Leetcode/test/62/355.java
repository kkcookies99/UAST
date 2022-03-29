 class Solution {
    public int XXX(int m, int n) {
        int [][]dp=new int[m+2][n+2];
        dp[0][1]=1;
        dp[1][0]=0;
   

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m][n];
    }
}

