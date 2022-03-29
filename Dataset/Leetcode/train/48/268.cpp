class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n(matrix.size());
        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                swap(matrix[i][j],matrix[j][i]);
            }
        }
        for (auto &row : matrix) {
            reverse(row.begin(),row.end());
        }
        return;
    }
};

