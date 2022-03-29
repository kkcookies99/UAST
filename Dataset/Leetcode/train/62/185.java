    public int XXX(int m, int n) {
        //dp[i][j] 定义为走到第i行第j列有多少种走法 , i取值范围 [1,m] j取值范围[1,n]
        int[][] dp = new int[m + 1][n + 1];
        //base case
        for (int row = 1; row <= m; row++) {
            dp[row][1] = 1;
        }
        for (int col = 1; col <= n; col++) {
            dp[1][col] = 1;
        }
        for (int row = 2; row <= m; row++) {
            for (int col = 2; col <= n; col++) {
                dp[row][col] = dp[row - 1][col] + dp[row][col - 1];
            }
        }
        return dp[m][n];
    }

