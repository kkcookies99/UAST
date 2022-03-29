 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        if(numRows == 0) return vector<vector<int>>{};
        //if(numRows == 1) return vector<vector<int>>{{1}};
        vector<vector<int>> res = {{1}};
        for(int i = 1; i < numRows; ++i) {
            vector<int> tmp;
            tmp.push_back(1);
            for(int j = 0; j < i - 1; ++j)
                tmp.push_back(res[i - 1][j] + res[i - 1][j + 1]);
            tmp.push_back(1);
            res.push_back(tmp);
        }
        return res;
    }
};

