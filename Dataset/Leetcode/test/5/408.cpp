 class Solution {
public:
    string XXX(string s) {
        //https://leetcode-cn.com/problems/longest-palindromic-subsequence/ 516. 最长回文子序列
        /*
        *和最长回文子序列不同的是最长回文子串是连续的
        */
        int n=s.size();
        int start=0;       
        int length=0;
        vector<vector<bool>> dp(n,vector<bool>(n,false));
        /*[i,j]是否为回文子串*/
        for(int i=n-1;i>=0;--i){
            for(int j=i;j<n;++j){
                if(s[i]==s[j]){
                    if(j-i<=1)dp[i][j]=true;
                    else dp[i][j]=dp[i+1][j-1];
                }
                if(dp[i][j]&&(j-i+1)>length){
                    length=j-i+1;
                    start=i;
                }
            }
        }
        return s.substr(start,length);
    }
};
