 class Solution {
    public int XXX(int m, int n) {
        //动态规划，用组合也行不过感觉没必要麻烦
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                //在上边和左边界，机器人如果要到达只能走一种路线
                if(i == 0 || j == 0) dp[i][j] = 1;
                //到达dp[i][j]点的可能路线就是其上方的可能路线数加左方的可能路线数
                else dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}

