 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        int mid = n >> 1;
        int midi, midj;
        if (n % 2 == 0) {
            midi = n / 2 - 1;
            midj = n / 2 - 1;
        } else {
            midi = n / 2;
            midj = n / 2 - 1;
        }
        for (int i = 0; i <= midi; i++) {
            for (int j = 0; j <= midj; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = tmp;
            }
        }
    }
};

