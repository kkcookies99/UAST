 class Solution {
    public int XXX(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){dp[i][0] = 1;}// 第0列全部都是1
        for(int i = 0; i < n; i++){dp[0][i] = 1;}// 第0行全部都是1
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];//从上方下来和从左方过来
            }
        }
        return dp[m-1][n-1];
    }
}

