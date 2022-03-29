 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        if (numRows==0) return vector<vector<int>>();
        vector<vector<int>> ans(numRows);
        for (int i=0;i<numRows;i++){
            for (int j=0;j<=i;j++){
                if (j==0||j==i) ans[i].push_back(1);
                else ans[i].push_back(ans[i-1][j-1]+ans[i-1][j]);
            }
        }
        return ans;
    }
};

