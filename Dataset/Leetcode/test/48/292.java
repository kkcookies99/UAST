class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        // col: n为奇数时，多选一列
        int temp = 0, row = n/2, col = n%2==1? n/2+1:n/2;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }
    }
}

