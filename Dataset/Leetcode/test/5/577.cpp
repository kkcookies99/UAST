 class Solution {
public:
    string XXX(string s) {
        int n = s.size();
        vector<vector<bool>> dp(n+1,vector<bool>(n+1));
        //dp[i][j] = dp[i+1][j-1] && s[i] == s[j]
        // for(int i=0;i<n;++i)
        //     dp[i][i] = true;
        int maxLen=1,i=0,j = 0;
        for(int l=n-1;l>=0;--l) {
            for(int r= l;r<n;++r) {
                if(l==r) dp[l][r] = true;
                else if (r==l+1)
                    dp[l][r] = s[l]==s[r];
                // if(l<r) {
                else 
                    dp[l][r] = dp[l+1][r-1] && (s[l] == s[r]);
                   
                // }
                if(dp[l][r] && r-l+1>maxLen) {
                    maxLen = r-l+1;
                    i = l,j = r;
                }
            }
        }
        return s.substr(i,maxLen);
        // return dp[0][n-1];
    }
};

