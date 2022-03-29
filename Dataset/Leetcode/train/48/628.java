 class Solution {
    public void XXX(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // 1. 进行行翻转
        for(int i = 0;i < m/2;i++){
            for(int j = 0; j < n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[m - 1 - i][j];
                matrix[m - 1 - i][j] = temp;
            }
        }

        // 2. 矩阵转置
        for(int i = 0;i < m;i++){
            for(int j = 0;j < i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}

