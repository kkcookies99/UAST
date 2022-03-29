 class Solution {
public:
    string XXX(string s) {
        if(s.size()<2)   return s;
        int n = s.size(), start=0, mlen=1;
        int dp[n+1][n+1]{0};
        for(int i=0; i<n+1; i++){
            dp[i][i] = 1;                       //单个字符必定是回文
            if(i+1<n+1 && s[i] == s[i+1]){
                mlen = 2;
                start = i;
                dp[i][i+1] = 1;                 //相邻字符相同也是回文
            }
        }
        for(int len=2; len<n; len++){           //字符串长度，这个长度是不包含起始位置的 所以后面计算的时候需要加1
            for(int i=0; i<n; i++){             //字符串起始位置
                if(i+len<n&&s[i] == s[i+len]){
                    dp[i][i+len] = dp[i+1][i+len-1];
                    if(dp[i][i+len] && len+1>mlen){
                        mlen = len+1;
                        start = i;
                    }
                }
            }
        }
        return s.substr(start, mlen);           //切割出子串
    }
};

