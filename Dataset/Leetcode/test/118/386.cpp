 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        for (int i = 0; i < numRows; i++) {
            vector<int> val;
            val.push_back(1);
            for (int j = 1; j < i; j++)
                val.push_back(ans[i - 1][j - 1] + ans[i - 1][j]);
            if (i)
                val.push_back(1);
            ans.push_back(val);
        }
        return ans;
    }
};

