 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        int rowLength = 1;
        vector<vector<int>> ans;
        for (int i = 0; i < numRows; i++) {
            vector<int> temp;
            for (int j = 0; j < rowLength; j++) {                
                if (j == 0 || j == rowLength-1) temp.push_back(1);
                else temp.push_back(ans[i-1][j] + ans[i-1][j-1]);                
            }
            ans.push_back(temp);
            rowLength++;
        }
        return ans;        
    }
};

