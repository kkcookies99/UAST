class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        if (n <= 0) {
            return ;
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (n - 1 - j <= j) {
                    break;
                }
                swap(matrix[i][j], matrix[i][n - 1 - j]);
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - 1 - i; ++j) {
                swap(matrix[i][j],  matrix[n - 1 - j][n - 1 - i]);
            }
        }
        return ;
    }
};

