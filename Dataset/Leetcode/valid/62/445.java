class Solution {
    public int XXX(int m, int n) {
        int[][] obstacleGrid = new int[m][n];
        return XXXWithObstacles(obstacleGrid);
    }
    public int XXXWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        int[][] dp = new int[row][col];
        dp[0][0] = obstacleGrid[0][0] == 1 ? -1:1;

        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = -1;
                }
            }
        } 

        for(int i = 1;i<row;i++){
            dp[i][0] = obstacleGrid[i][0] == 1 ? -1 : (dp[i-1][0] == -1? -1:1);
        }
        for(int j = 1;j<col;j++){
            dp[0][j] = obstacleGrid[0][j] == 1 ? -1: (dp[0][j-1] == -1? -1:1);
        }

        for(int i = 1;i<row;i++){
            for(int j = 1;j<col;j++){
                if(dp[i][j] == -1) dp[i][j] = -1;
                else if(dp[i-1][j] != -1 && dp[i][j-1] != -1) dp[i][j] = dp[i-1][j] + dp[i][j-1];
                else if(dp[i-1][j] != -1) dp[i][j] = dp[i-1][j];
                else dp[i][j] = dp[i][j-1];
            }
        }
        return dp[row-1][col-1] == -1 ? 0:dp[row-1][col-1];
    }
}

