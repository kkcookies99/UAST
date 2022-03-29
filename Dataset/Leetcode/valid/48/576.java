 class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        if(n < 2){
            return;
        }
        // 从左上到右下斜对称
        for(int i = 1; i < n; ++i){
            for(int j = 0; j < i; ++j){
                // 交换坐标 (i,j) (j,i)的值
                matrix[i][j] = matrix[i][j] + matrix[j][i] - (matrix[j][i] = matrix[i][j]);
            }
        }
        // y轴对称
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n/2; ++j){
                matrix[i][j] = matrix[i][j] + matrix[i][n - j - 1] - (matrix[i][n - j - 1] = matrix[i][j]);
            }
        }
    }
}

