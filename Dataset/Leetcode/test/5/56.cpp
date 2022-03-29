 class Solution {
public:
    string str = "";
    string XXX(string s) {
        int len = s.length();
        if(len==0)
            return str;
        str += s[0];
        if(len==1)
        {
            return str;
        }
        if(len==2)
        {
            if(s[0]!=s[1])
            {
                return str;
            }
        }
        int flag = 0;
        for(int i=0;i<len;i++)
        {
            if(i<len-1&&s[i]!=s[i+1])
            {
                flag = 1;
                break;
            }  
        }
        if(flag==0)
            return s;
        int dp[len][len];    //dp[i][j]代表s[i~j]是否为回文串，是为1，不是为0
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                dp[i][j] = 0;
            }
        }
        for(int i=0;i<len;i++)
        {
            dp[i][i] = 1;       //对角线上，自己到自己肯定为1
            if(i<len-1)
                if(s[i]==s[i+1])
                {
                    dp[i][i+1] = 1;
                    str = s.substr(i,2);
                }
        }
        for(int L=3;L<=len;L++)   //枚举子串的长度
        {
            for(int i=0;i+L-1<len;i++)   //枚举子串的起始端点
            {
                int j = i + L - 1;   //子串的右边界
                if(s[i]==s[j]&&dp[i+1][j-1]==1)
                {
                    dp[i][j] = 1;
                    str = s.substr(i,L);
                }
            }
        }
        return str;
    }
};

