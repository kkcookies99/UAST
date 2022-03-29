  public int XXX(int m, int n) {
        /**总共有多少条路线到[m][n]
        其实就是到[m-1][n]的路线和到[m][n-1]的路线总和
        求子问题的解
        only down or right 
        明确base case， 明确状态，写出状态转移方程 */
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int i = 0; i < m; i++){
            for(int j =0 ;j < n; j++){
                if(i==0||j==0)dp[i][j]=1;
                else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];

    }

