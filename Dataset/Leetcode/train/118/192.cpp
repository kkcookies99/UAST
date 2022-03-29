 class Solution {
public:
    vector<vector<int>> XXX(int n) {
        vector<vector<int>> ret;
        for (int i = 0; i < n; ++i) {
            vector<int> t;
            int cur = 1;
            for (int j = 0; j <= i; ++j) {
                t.emplace_back(cur);
                cur = cur * (i - j) / (j + 1);
                // cout << "i, j, cur = " << i << ' ' << j << ' ' << cur << endl;
            }
            ret.emplace_back(t);
        }
        return ret;
        
    }
};

