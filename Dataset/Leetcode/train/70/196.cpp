class Solution {
public:
    int XXX(int n) {
        if (n<2) return n;
        vector<int> dp(n+1, 0);
        dp[0] = 1;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=2; j++) {
                if (i-j>=0) dp[i] += dp[i-j];
            }
        }
        return dp[n];
    }
};

