 class Solution {
    public int XXX(int m, int n) {
        int res = 0;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(j == 0 || i == 0)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                if(dp[i][j] > res)
                    res = dp[i][j];
            }
        }
        return res;
    }
}

