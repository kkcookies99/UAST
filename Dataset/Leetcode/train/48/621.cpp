 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        int i, j;

        for(i = 0; i < n / 2; i++){
            for(j = i; j < n - i - 1; j++){
                int temp = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = temp;
            }
        }
    }
};

