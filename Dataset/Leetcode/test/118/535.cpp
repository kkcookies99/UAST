 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector <vector<int>> res;
        for (int i = 1; i <= numRows; i++) {
            vector <int> tmp(i, 1);
            for (int k = 1; k < i-1; k++) {
                tmp[k] = res[i-2][k-1] + res[i-2][k];
            }
            res.push_back(tmp);
        }
        return res;
    }
};

