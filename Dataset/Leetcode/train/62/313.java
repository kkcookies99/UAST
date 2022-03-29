 class Solution {
    public int XXX(int m, int n) {
        //动态规划DP-路径问题
        int[][] dp = new int[m][n];
        Arrays.fill(dp[0], 1);
        for(int i=1; i< m; i++){
            dp[i][0]= 1;
            for(int j = 1; j<n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}

