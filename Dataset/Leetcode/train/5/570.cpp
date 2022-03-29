 class Solution {
public:
    string XXX(string s) {
        int dp[1001][1001];
        memset(dp, 0, sizeof(dp));

        for (int i = 1; i <= s.length();i++)
        {
            dp[i][i] = 1;
        }
        int Maxlen = 1;
        int begin = 0;
        for (int len = 2;len <= s.length() ;len++)
        {
            for (int i = 1; i <= s.length() ;i++)
            {
                int j = i + len -1;
                if (j > s.length())
                    break;
                if (s[i-1]==s[j-1])
                    dp[i][j] = dp[i+1][j-1] + 2;
                    else dp[i][j] = max(dp[i][j], dp[i][j-1]>dp[i+1][j]?dp[i][j-1]:dp[i+1][j]);
                if (dp[i][j] > Maxlen)
                {
                    Maxlen = dp[i][j];
                    begin = i - 1;
                }
            }
        }
        return s.substr(begin,Maxlen);
    }
};

