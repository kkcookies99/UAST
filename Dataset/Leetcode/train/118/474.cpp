 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans(numRows);
        if(numRows == 0) return ans;
        ans[0].push_back(1);
        for(int i = 1;i < numRows;i++) {
            int j = 1;
            ans[i].push_back(1);
            while(j < i) ans[i].push_back(ans[i - 1][j - 1] + ans[i - 1][j]), ++j;
            ans[i].push_back(1);
        }
        return ans;
    }
};

