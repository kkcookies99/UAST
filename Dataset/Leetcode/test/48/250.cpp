class Solution {
public:
    // 基础公式：maxtrix[i][j] = maxtrix[n - 1 - j][i]
    // 列变行，行变列
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();

        for (int i = 0; i < n / 2; i ++) {
            for (int j = 0; j < (n + 1) / 2; j ++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = tmp;
            }
        }
    }
};

