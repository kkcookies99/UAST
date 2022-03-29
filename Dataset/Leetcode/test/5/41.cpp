 class Solution {
public:
    string XXX(string s) {
        int len=s.size();
        vector<vector<int>> dp(len,vector<int>(len));
        string res;
        for(int l=1;l<=len;++l)
        for(int i=0;i+l-1<len;++i)
        {
            if(l==1)
                dp[i][i+l-1]=true;
            else if(l==2)
                dp[i][i+l-1]=s[i]==s[i+l-1];
            else
            {
                dp[i][i+l-1]=dp[i+1][i+l-2]&(s[i]==s[i+l-1]);
            }
            if(dp[i][i+l-1]==true&&l>res.size())
            {
                res=s.substr(i,l);
            }
        }
        return res;
    }
};

