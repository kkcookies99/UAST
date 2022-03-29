int XXX(int n){
    int dp[n+1]; //爬到第i阶的总方法
    int i;

    dp[0] = 1;
    dp[1] = 1;

    for(i=2; i<=n; i++)
    {
        dp[i] = dp[i-1] + dp[i-2];
    }

    return dp[n];
}

