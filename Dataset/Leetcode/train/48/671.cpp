 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                int temp = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = temp;
            }
        }
    }
};


