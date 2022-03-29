 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>>dp;
        for(int i = 1; i <= numRows; i++){
            vector<int> vec(i,1);
            dp.push_back(vec);
            vec.clear();
        }
        //if(numRows <= 2)  return dp;
        for(int i = 2; i < numRows; i++){
            for(int j = 1; j < dp[i].size()-1; j++){
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        return dp;
    }
};

