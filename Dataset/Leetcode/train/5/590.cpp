 class Solution {
public:
    string XXX(string s) {
        int n = s.size();
        vector<vector<bool>> dp(n, vector<bool>(n+1, 0));//i
        
        for(int i=1; i<=n; i++)
        {
            dp[i-1][1] = true;
            dp[i-1][0] = true;//对于偶数来说 dp[0][2] = dp[0][0] && s[0] == s[1]
        }
        int start = 0;
        int maxlen = 1;
        
        for(int len = 2; len <=n; len++)
        {
            for(int i = 0; i + len -1 < n; i++)
            {
                if(len & 0x1)
                {
                    if(dp[i+1][len-2] && s[i] == s[i+len-1])
                    {
                        dp[i][len] = true;
                        start = i;
                        maxlen = len;
                    }
                }else{
                    if(dp[i+1][len-2] && s[i] == s[i+len-1])
                    {
                        dp[i][len] = true;
                        start = i;
                        maxlen = len;
                    }
                }
            }
            

        }
        return s.substr(start, maxlen);

    }
};


