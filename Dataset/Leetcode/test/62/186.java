 class Solution {
    public int XXX(int m, int n) {
        // dp代表当前位置的路线数
        // 初始化0行0列防止越界
        int[][] dp=new int[m+1][n+1];
        // 初始化起点
        dp[1][1]=1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1&&j==1) {
                    continue;
                }
                dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[m][n];

    }
}

