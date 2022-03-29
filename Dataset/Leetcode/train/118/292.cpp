 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        vector<int> tmp;
        for (int i = 1; i <= numRows; ++i) {
            vector<int> t = tmp;
            tmp.clear();
            tmp.push_back(1);
            if (i > 2) {
                for (int j = 1; j < i - 1; ++j) {
                    tmp.push_back(t[j - 1] + t[j]);
                }
            }
            if (i != 1) tmp.push_back(1);
            ans.push_back(tmp);
        }
        return ans;
    }
};

