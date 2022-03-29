class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        vector<vector<int>> ans;
        vector<int> row;
        for(int j = 0; j < n; ++j){
            for(int i = n - 1; i >= 0; --i){
                row.push_back(matrix[i][j]);
            }
            ans.push_back(row);
            row.clear();
        }
        matrix = ans;
    }
};

