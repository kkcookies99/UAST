 class Solution {
    public int XXX(int m, int n) {
        int[][] dp = new int[m][n];
        dp[m - 1][n - 1] = 1;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i < m - 1) {
                    dp[i][j] += dp[i + 1][j];
                }
                if (j < n - 1) {
                    dp[i][j] += dp[i][j + 1];
                }
            }
        }
        return dp[0][0];
    }
}

