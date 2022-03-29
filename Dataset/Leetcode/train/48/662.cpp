 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        for(int i = 0, n = matrix.size(); i < n/2; ++i){
            for(int j = i, m = n-i-1; j < m; ++j){
                swap(matrix[i][j], matrix[j][m]);
                swap(matrix[m][n-j-1], matrix[n-j-1][i]);
                swap(matrix[m][n-j-1], matrix[i][j]);
            }
        }
    }
};

