class Solution {
public:
    int XXX(int m, int n) {
        vector dp (m + 1, vector(n + 1, 0));
        dp[0][1] = 1;
        for (int i = 0; i != m; ++i) for (int j = 0; j != n; ++j)
        dp[i + 1][j + 1] = dp[i + 1][j] + dp[i][j + 1];
        return dp[m][n];
    }
};

