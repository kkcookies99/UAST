 class Solution {
public:
    //dp[i][j]：从i开始到j结尾的字符串是不是回文串
    string XXX(string s) {
        vector<vector<bool>> dp(s.size(), vector<bool>(s.size(), false));
        int len = -1;
        string result;
        for (int i = s.size() - 1; i >= 0; --i) {
            for (int j = i; j < s.size(); ++j) {
                if (s[i] == s[j]) {
                    if (j - i <= 1) {
                        dp[i][j] = true;
                        if (len < j - i + 1) {
                            len = j - i + 1;
                            result = s.substr(i, j - i + 1);
                        }
                    }
                    else if (dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        if (len < j - i + 1) {
                            len = j - i + 1;
                            result = s.substr(i, j - i + 1);
                        }
                    }    
                }
            }
        }
        return result;
    }
};

