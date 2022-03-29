class Solution {
public:
    int XXX(int n) {
        if (n == 1 || n == 2) return n;
        vector<int> dp(3);
        dp[0] = 1;
        dp[1] = 2;
        int pos = 2;
        while (pos < n) {
            dp[pos % 3] = dp[(pos + 1) % 3] + dp[(pos + 2) % 3];
            pos++;
        }
        return *max_element(dp.begin(), dp.end());
    }
};

