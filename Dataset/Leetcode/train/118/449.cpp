 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        if (!numRows) return {};
        vector<vector<int>> res(numRows);
        res[0] = {1};
        for (int i = 1; i < numRows; ++i) {
            res[i] = vector<int>(i + 1);
            res[i][0] = res[i][i] = 1;
            for (int j = 1; j < i; ++j) 
                res[i][j] = res[i - 1][j] + res[i - 1][j - 1];
        }
        return res;
    }
};

