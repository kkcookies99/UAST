 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        if (numRows <= 0) return ans;
        ans.push_back({1});
        for (int i = 1; i < numRows; i++) {
            vector<int> v(i+1);
            v[0] = ans[i-1][0];
            v[i] = ans[i-1][i-1];
            for (int j = 1; j < i; j++) v[j] = ans[i-1][j-1] + ans[i-1][j];
            ans.push_back(v);
        }
        return ans;
    }
};

