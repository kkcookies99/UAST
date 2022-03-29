 class Solution {
public:
    string XXX(string s) {
        int dp[1005][1005]={0}; //dp[i][j]=1表示从si-sj为回文子串
        int len=s.length();
        if(len==0) return "";
        int ans=1,start=0;
        for(int i=0;i<len;i++)
        {
            dp[i][i]=1;
            if(i+1<len&&s[i]==s[i+1])
            {
                dp[i][i+1]=1;
                ans=2;
                start=i;
            }
        }
    
    int L=3;

        for(int L=3;L<=len;L++)
        {
            for(int i=0;i+L-1<len;i++)
            {
                int j=i+L-1;
                if(dp[i+1][j-1]==1&&s[i]==s[j])
                {
                    dp[i][j]=1;
                    ans=L;
                    start=i;
                }
            }
        }
        string res="";
        for(int i=start;i<start+ans;i++)
        {
            res+=s[i];

        }
        return res;
    }
};

