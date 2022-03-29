 class Solution {
    public int XXX(int m, int n) {
        // 分解成子问题
        // dp[i][j] 表示机器人在（i，j）时到右下角的所有路径
        // dp[i][j] = dp[i+1][j] + dp[i][j+1];
        int[][] dp = new int[m][n];

        for(int i=0; i<m; i++) {
            dp[i][n-1] = 1;
        }

        for(int i=0; i<n; i++) {
            dp[m-1][i] = 1;
        }

        for(int i=m-2; i>=0; i--) {
            for(int j=n-2; j>=0; j--) {
                dp[i][j] = dp[i+1][j] + dp[i][j+1];
            }
        }

        return dp[0][0];
    }
}

