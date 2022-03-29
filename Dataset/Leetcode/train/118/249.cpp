 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        if(numRows == 1) return {{1}};
        vector<vector<int>> res;
        res.push_back({1});
        res.push_back({1, 1});
        for(int i = 2; i < numRows; ++i) {
            vector<int> level(i + 1, 1);
            for(int j = 1; j < i; ++j)
                level[j] = res[i - 1][j - 1] + res[i - 1][j];
            res.push_back(level);
        }
        return res;
    }
};

