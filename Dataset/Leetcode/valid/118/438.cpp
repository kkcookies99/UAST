 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> dp(numRows, vector<int>(numRows));
        vector<vector<int>> res(numRows);
        for(int i=0; i<numRows; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) dp[i][j] = 1;
                else
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                res[i].push_back(dp[i][j]);
            }
        }
        return res;
    }
};

