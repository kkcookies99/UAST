 class Solution {
    public int XXX(int m, int n) {
        int[][] dp = new int[m][n];
        // 状态转移方程 dp[m][n] = dp[m - 1][n] + dp[m][n - 1]
        dp[0][0] = 1;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                // 初始化
                if(i == 0 || j == 0){
                    dp[i][j] = 1;
                }
                else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m-1][n-1];
    }
}

