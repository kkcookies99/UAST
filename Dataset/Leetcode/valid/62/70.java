 class Solution {
    public int XXX(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int i = 0;i < m;i++){
            for(int j=0;j<n;j++){
                if(i==0&&j==0) continue;
                if(i==0){
                    dp[i][j]=dp[i][j-1];
                    continue;
                }
                if(j==0){
                    dp[i][j]=dp[i-1][j];
                    continue;
                }
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}

