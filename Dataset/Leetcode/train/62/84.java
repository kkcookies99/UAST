 class Solution {
    public int XXX(int m, int n) {
        int [][]dp = new int [m + 1][n + 1];
        dp[1][1] = 1;
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if (i == 1 && j == 1)continue;
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m][n];
    }
}```

