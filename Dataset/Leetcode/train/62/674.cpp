class Solution {
public:
    int XXX(int m, int n) {
        int dp[105][105];
        memset(dp,0,sizeof dp);
        dp[0][1] = 1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m][n];
    }
};

