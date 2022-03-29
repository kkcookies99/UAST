class Solution {
    public int XXX(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        //dp[x][y]代表从xy 到 mn的方案数
        //dp[x][y] = dp[x + 1][y] + dp[x][y+1];
        for(int i = 1;i <= n ;i++){
            dp[m][i] = 1;
        }
        for(int j = 1; j <= m;j++){
            dp[j][n] = 1;
        }
        for(int i = m - 1; i >= 1;i--){
            for(int j = n - 1;j >= 1;j--){
                dp[i][j] = dp[i][j+1] + dp[i + 1][j];
            }
        }
        return dp[1][1];
    }
}

