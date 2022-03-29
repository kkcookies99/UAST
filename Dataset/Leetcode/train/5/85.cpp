 class Solution {
public:
    string XXX(string s) {
        int n = s.size();
        string ret;
        vector<vector<bool>> dp(n, vector<bool>(n));

        for(int len = 1; len <= n; ++len){
            for(int i = 0; i <= n - len; ++i){
                int j = i + len - 1;
                if(len == 1) dp[i][j] = true;
                else if(len == 2) dp[i][j] = (s[i] == s[j]);
                else dp[i][j] = (s[i] == s[j] && dp[i+1][j-1]);
                if((j - i + 1 > ret.size() && dp[i][j])) ret = s.substr(i, len);
            }
        }
        return ret;
    }
};

