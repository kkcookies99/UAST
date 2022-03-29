 class Solution {
public:
    string XXX(string &s) {
        int h=0,max=1;
        vector<vector<bool>> dp(s.size(),vector<bool>(s.size(),true));
        for(int i=s.size()-1;i>=0;i--){
            for(int j=s.size()-1;j>i;j--){
                if(s[i]==s[j]&&(dp[i][j]=dp[i+1][j-1])){
                  if(j-i+1>max){
                      max=j-i+1;
                      h=i;
                  }
                }
                else dp[i][j]=false;
            }
        }
        return s.substr(h,max);
   }
};

