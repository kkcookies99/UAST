 class Solution {
public:
    
    string XXX(string s) {
        int maxlen = 0, l = 0, r = 0;
        int dp[1002][1002];
        memset(dp, 0, sizeof(dp));
        for (int i = s.size() - 1; i >= 0; i--){
            for (int j = i; j < s.size(); j++){
                if (s[i] == s[j]){
                    if (j - i <= 1 || dp[i + 1][j - 1]) dp[i][j] = true;
                    if (dp[i][j] && j - i + 1 > maxlen) {
                        maxlen = j - i + 1;
                        l = i;
                        r = j;
                    }
                }
            }
        }
        return s.substr(l, r - l + 1);
    }
};

