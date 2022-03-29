 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> dp(numRows + 1, vector<int>(numRows + 1, 0));
        vector<vector<int>> res;
        dp[1][1] = 1;
        for(int i = 2; i <= numRows; i ++) {
            for(int j = 1; j <= i; j ++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        for(int i = 1; i <= numRows; i ++) {
            vector<int> temp;
            for(int j = 1; j <= i; j ++) {
                temp.push_back(dp[i][j]);
            }
            res.push_back(temp);
        }
        return res;
    }
};

