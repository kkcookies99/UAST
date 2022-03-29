 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> r;

        for (int i = 0; i < numRows; i++) {
            vector<int> t;
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) t.push_back(1);
                else t.push_back(r[i - 1][j - 1] + r[i - 1][j]);
            }
            r.push_back(t);
        }

        return r;
    }
};```

