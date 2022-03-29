 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        if(numRows == 0) return ans;
        ans.push_back({ 1 });
        for (int i = 1; i < numRows; ++i) {
            vector<int> temp;
            temp.emplace_back(1);
            for (int j = 0; j < ans[i - 1].size() - 1; ++j) {
                temp.emplace_back(ans[i - 1][j] + ans[i - 1][j + 1]);
            }
            temp.emplace_back(1);
            ans.emplace_back(temp);
        }
        return ans;
    }
};

