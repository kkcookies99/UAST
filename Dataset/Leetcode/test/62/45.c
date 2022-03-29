 int XXX(int m, int n){
    int dp[m][n];
    int i, j;

    for(i = 0; i < m; i++)
    {
        for(j = 0; j < n; j++)
        {
            if(0 == i || j == 0)
            {
                 dp[i][j] = 1;
            }
            else
            {
            dp[i][j] = dp[i-1][j] + dp[i][j -1];
            }
        }
    }
    return dp[m - 1][n -1];
}

