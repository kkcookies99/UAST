class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        // 四个一组进行交换
        int row = matrix.size(), col = matrix[0].size();
        int half = row / 2;
        int t1, t2, t3, t4;
        for (int i = 0; i <= half; i++) {
            for (int j = i; j < col - 1 - i; j++) {
                t1 = matrix[i][j];
                t2 = matrix[j][col - 1 - i];
                t3 = matrix[row - 1 - i][col - 1 - j];
                t4 = matrix[row - 1 - j][i];
                matrix[i][j] = t4;
                matrix[j][col - 1 - i] = t1;
                matrix[row - 1 - i][col - 1 - j] = t2;
                matrix[row - 1 - j][i] = t3;
            }
        }
    }
};
// [0 0] [0 2] [2 2] [2 0]
// [0 1] [1 2] [2 1] [1 0] 
// [1 1] [1 1] [1 1] [1 1]

