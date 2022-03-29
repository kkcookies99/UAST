 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> result;
        for (int i = 1; i <= numRows; ++i) {
            vector<int> row(i, 1);
            for (int j = 1; j < i - 1; ++j) {
                row[j] = result.back()[j - 1] + result.back()[j];
            }
            result.push_back(row);
        }
        return result;
    }
};

