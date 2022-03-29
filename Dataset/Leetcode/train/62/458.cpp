class Solution {
public:
    int XXX(int m, int n) {
        if (m == 1 || n == 1) return 1;
        vector<int> dp(n + 1, 1);
        dp[0] = 0;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[n];
    }
};

