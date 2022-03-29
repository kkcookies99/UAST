 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> dp(numRows);
        dp[0].push_back(1);//第一个数
        for(int i=1;i<numRows;i++){
            for(int j=0;j<=i;j++){
                if(j==0) dp[i].push_back(dp[i-1][j]);
                else if(j>dp[i-1].size()-1) dp[i].push_back(dp[i-1][j-1]);
                else dp[i].push_back(dp[i-1][j]+dp[i-1][j-1]);
            }
        }
        return dp;
    }
};

