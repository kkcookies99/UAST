class Solution {
    public int XXX(int m, int n) {
        if(m == 0 || n == 0){
            return 0;
        }
        int dp[][] = new int[m][n];
        dp[0][0] = 1;
        for(int i = 0;i < m;i++){
            for(int j = 0 ; j < n; j++){
                int down = i - 1 < 0 ? 0 : dp[i-1][j];
                int left = j - 1 < 0 ? 0 : dp[i][j-1];
                dp[i][j] += down + left;
            }
        }
        return dp[m-1][n-1];
    }
}

