 class Solution {
    public int XXX(int m, int n) {
        if(m==1 && n==1) return 1;
        int[][] dp = new int[m+1][n+1];
        for(int i = 1; i<=m; i++){
            for(int j = 1; j<=n; j++){
                if(i == 1 && j == 1) dp[i][j] = 1;
                else dp[i][j] = dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[m][n];
    }
}

