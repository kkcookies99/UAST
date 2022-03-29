 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        int value;
        vector<int> row;
        vector<vector<int> > ans;

        for (int i = 0; i < numRows; ++i) {
            for (int j = 0; j <= i; ++j) {
                if (j == 0) {
                    value = 1;
                    row.emplace_back(1);
                } else {
                    value = value * (i - j + 1) / j;
                    row.emplace_back(value);
                }
            }
            ans.emplace_back(row);
            row.clear();
        }
        return ans;
    }
};

