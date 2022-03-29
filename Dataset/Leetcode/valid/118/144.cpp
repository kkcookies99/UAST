 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int> > vec;
        for (int i = 0; i < numRows; i++) {
            vector<int> v;
            if (i == 0) {
                v.push_back(1);    
            } else {
                v.push_back(1);
                for (int j = 0; j < vec[i - 1].size() - 1; j++) {
                    v.push_back(vec[i - 1][j] + vec[i - 1][j + 1]);
                }
                v.push_back(1);
            }
            vec.push_back(v);
        }
        return vec;
    }
};

