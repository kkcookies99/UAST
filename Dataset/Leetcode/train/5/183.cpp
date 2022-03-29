 const int N = 1e3 + 50;
int dp[2][N]; // only use two row 
class Solution {
public:
    // dp[i][j] --> str[i : j] is Palindrome? 
    // dp[i][j] --> dp[i + 1][j - 1] & s[i - 1] == s[j - 1]
    string XXX(string s) {
        int n = s.size(), len(0), idx(0);
        memset(dp, 0, sizeof(dp));

        for (int i = n; i >= 1; -- i){
            for (int j = i; j <= n; ++ j){
                if (j - i == 0) dp[i & 1][j] = 1;
                else if (j - i == 1) dp[i & 1][j] = (s[i - 1] == s[j - 1]);
                else dp[i & 1][j] = dp[(i + 1) & 1][j - 1] & (s[i - 1] == s[j - 1]);
                if (dp[i & 1][j] && j - i + 1 > len) len = j - i + 1, idx = i - 1;
            }
        }

        return s.substr(idx, len);
    }
};

