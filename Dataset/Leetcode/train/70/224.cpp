class Solution {
public:
    int XXX(int n) {
        if (n <= 2)
            return n;
        vector<int> dp(n + 1);
        vector<int> w = {1, 2};
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; ++i) {
            for (int j = 0; j < w.size(); ++j) {
                if (i >= w[j])
                    dp[i] = dp[i] + dp[i - w[j]];
            }
        }
        return dp[n];
    }
};

