class Solution {
public:
    int XXX(int n) {   
        if (n <= 3) {
            return n;
        }
        int dp[n];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 3;
        for (auto i = 3; i < n; ++i) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n -1];
    }
};

