 class Solution {
public:
    string XXX(string s) {
        int len=s.size();
        vector<vector<bool>> dp(len,vector<bool>(len,false));
        for(int j=0;j<len;j++){//j-1代表j从小到大
            for(int i=j;i>=0;i--)//i+1代表i从大到小
                dp[i][j] = (s[i]==s[j])&&(i+1>j-1||dp[i+1][j-1]);//各去掉两边之后，要么是不剩下，要么看剩下是否为回文子串。
        }
        int start=0,maxlen=0;
        for(int i=0;i<len;i++)
            for(int j=i;j<len;j++)
            {
                if(dp[i][j]&&j-i+1>maxlen)
                start=i,maxlen=j-i+1;
            }
        return s.substr(start,maxlen);
    }
};

