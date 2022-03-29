class Solution {
public:
    //入门级动态规划吧，终于算入了门了我
    int dynamicPaths(int m, int n)
    {
        vector<vector<int>> dp(m, vector<int>(n));
        for(int i = 0; i < n; i++)
            dp[0][i] = 1;
        for(int i = 0; i < m; i++)
            dp[i][0] = 1;
        for(int i = 1; i < m; i++)
            for(int j = 1; j < n; j++)
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        return dp[m - 1][n - 1];
    }

    int XXX(int m, int n) {
        return dynamicPaths(m, n);
    }

};

