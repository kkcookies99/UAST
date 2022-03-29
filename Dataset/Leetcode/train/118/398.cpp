 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res;
        vector<int> line = {1};
        res.push_back(line);

        if (numRows == 1) return res;

        for (int level = 2; level <= numRows; level ++) {
            vector<int> line;
            line.push_back(1);
            for (int i = 1; i < level - 1; i ++) {
                line.push_back(res[level - 2][i - 1] + res[level - 2][i]);
            }
            line.push_back(1);
            res.push_back(line);
        }

        return res;
    }
};

