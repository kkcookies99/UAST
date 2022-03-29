class Solution {
public:
    int XXX(int m, int n) {
        vector<vector<int>> dp(m, vector<int>(n));
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                dp[i][j] = i && j ? dp[i][j-1] + dp[i-1][j] : 1;
            }
        }   
        return dp[m-1][n-1];
    }
};

