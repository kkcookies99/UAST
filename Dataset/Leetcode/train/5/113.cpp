 class Solution {
public:
    string XXX(string s) {
        int n = s.size();
        if (n < 2) {
            return s;
        }
        vector<vector<int>> dp(n, vector<int>(n, 0));
        int loc = 0, len = 1;
        for (int i = 0; i < n; ++i) {
            dp[i][i] = 1;
            for (int j = 0; j < i; ++j) {
                if (s[i] == s[j]) {
                    if (j + 1 == i) {
                        dp[j][i] = 1;
                    } else {
                        dp[j][i] |= dp[j + 1][i - 1];
                    }
                }
                if (dp[j][i] == 1 && i - j + 1 > len) {
                    len = i - j + 1;
                    loc = j;
                }
            }
        }
        return s.substr(loc, len);
    }
};

