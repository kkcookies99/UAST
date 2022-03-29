 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res = vector<vector<int>>(numRows);
        for (int i = 0; i < numRows; i++) {
            res[i] = vector<int>(i + 1, 0);
            res[i][0] = res[i][i] = 1;
            for (int j = 1; j < i; j++)
                res[i][j] = res[i - 1][j - 1] + res[i - 1][j];
        }
        return res;
    }
};

