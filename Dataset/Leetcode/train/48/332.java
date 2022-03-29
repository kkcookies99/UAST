class Solution {
    public void XXX(int[][] matrix) {
        //官方题解
        // int n = matrix.length;
        // for (int i = 0; i < n / 2; ++i) {
        //     for (int j = 0; j < (n + 1) / 2; ++j) {
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[n - j - 1][i];
        //         matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
        //         matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
        //         matrix[j][n - i - 1] = temp;
        //     }
        // }
        /*
        执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
        内存消耗：38.5 MB, 在所有 Java 提交中击败了60.34%的用户
        
        */
        int row = matrix.length, col = matrix[0].length;
        
        for (int i = 0; i < row/2; i++){
            for (int j = col - 2 - i; j >= i; j--){
                swap(matrix, i, j, row - 1 - j , i);
                swap(matrix, row-1-j, i, row - 1 - i, row-1-j);
                swap(matrix, row-1-i, row-1-j ,  j ,  row - 1 -i);
            }
        } 
    }
    public void swap(int[][] matrix, int a, int b, int c, int d){
        int temp = matrix[c][d];
        matrix[c][d] = matrix[a][b];
        matrix[a][b] = temp;
    }
}


