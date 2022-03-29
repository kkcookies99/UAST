 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        int n = numRows;
        vector<vector<int>> dp(n, vector<int>(n, 0));
        for(int i = 0;i < n;++i)
        {
            dp[i][0] = 1;
            dp[i][i] = 1;
        }
        for(int i = 2;i < n;++i)
            for(int j = 1;j < i;++j)
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
        for(int i = 0;i < n;++i)
            dp[i].resize(i + 1);
        return dp;
    }
};

