     public int XXX(int m, int n) {
        int[][] dp = new int[m][n];
        int index = 0;
        for (index = 0; index < m; index++) {
            dp[index][0] = 1;
        }
        for (index = 0; index < n; index++) {
            dp[0][index] = 1;
        }

        for (index = 1; index < m; index++) {
            for (int j = 1; j < n; j++) {
                dp[index][j] = dp[index - 1][j] + dp[index][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }

