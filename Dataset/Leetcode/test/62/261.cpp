 class Solution {
public:
    int dp[100][100];
    int XXX(int m, int n) {
        if(m==1||n==1) return 1;

        // DP(i,j)表示从起点(0,0)到终点(i,j)的路径总数
        // DP(i,j) = DP(i-1,j) + DP(i,j-1)
        // 显然，现在还没有初始化前面的状态，这样的dp得到的结果只会是零
        // 在起点位置应为0，即DP[0][0]=0,而在第一行和第一列的位置都应为1
        // 显然，最终的结果是DP(m-1,n-1),所以要从左上角更新DP数组

        memset(dp, 0, sizeof(dp));

        for(int i=1;i<m;++i)//第一行初始化
            dp[i][0] = 1;

        for(int j=1;j<n;++j)//第一列初始化
            dp[0][j] = 1;

        for(int i=1;i<m;++i){
            for(int j=1;j<n;++j){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
};

