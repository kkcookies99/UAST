 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res;
        for(int i = 1; i <= numRows; ++i) {
            vector<int> a(i, 1);
            if(i >= 3) {
                for(int j = 1; j < i - 1; ++j) {
                    a[j] = res[i - 2][j - 1] + res[i - 2][j];
                }
            }
            res.push_back(a);
        }
        return res;
    }
};

