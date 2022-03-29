 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int temp = 0;
        int matrixSize = matrix.size();
        for(int i = 0; i < matrixSize - 1; ++i){
            for(int j = i; j < matrixSize - i - 1; ++j){
                temp = matrix[i][j];
                matrix[i][j] = matrix[matrixSize - j - 1][i];
                matrix[matrixSize - j - 1][i] = matrix[matrixSize - i - 1][matrixSize - j - 1];
                matrix[matrixSize - i - 1][matrixSize - j - 1] = matrix[j][matrixSize - i - 1];
                matrix[j][matrixSize - i - 1] = temp;
            }
        }
        return;
    }
};

