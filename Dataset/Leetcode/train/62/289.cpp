 class Solution {
public:
    int XXX(int m, int n) {
        if (m > n) return XXX(n, m);
        vector<vector<int>> dp(m+1, vector<int>(n+1, 0));
        dp[1][1] = 1;
        for (int i=1; i<m+1; ++i) {
            if (i>1) dp[i][i] = 2 * dp[i-1][i];
            for (int j=i+1; j<n+1; ++j) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            } 
        }
        return dp.back().back();
    }
};

