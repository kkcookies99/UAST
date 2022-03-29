 class Solution {
    public int XXX(int m, int n) {
        int[][] dp = new int[m][n];  // 从[0][0]到[i][j]有dp[i][j]条路径

        // 初始化
        for (int i=0; i<m; i++) {
            dp[i][0] = 1;  // 从[0][0]到每一行的第一个元素只有一种路径（只能向下或者向右）
        }

        for (int j=0; j<n; j++) {
            dp[0][j] = 1;  // 从[0][0]到每一列的第一个元素只有一张路径（只能向下或者向右）
        }

        for (int i=1; i<m; i++) {
            for (int j=1; j<n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
}

