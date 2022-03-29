 class Solution {
    public int XXX(int m, int n) {
        //这题是典型的动态规划题
        int[][] dp = new int[m][n];//dp[i][j]指的是到这个位置有几条路可以走

        //因为只能向下 或者向右走 所以第一行 第一列 都初始化为1
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        
        
        return dp[m-1][n-1];

    }

}

