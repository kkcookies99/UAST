 class Solution {
public:
    string XXX(int n) {
        vector<string> dp(n, "");
        dp[0] = '1';
        for(int i=1; i<n; ++i){
            int count = 1;
            for(int j=0; j<dp[i-1].size(); ++j){
                if(dp[i-1][j] == dp[i-1][j+1]){
                    count++;
                }else{
                    dp[i] += count+'0';
                    dp[i] += dp[i-1][j];
                    count = 1;
                }
            }
        }

        return dp[n-1];
    }
};

