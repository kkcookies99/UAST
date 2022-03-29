 class Solution {
    public void XXX(int[][] matrix) {
 

        int n = matrix.length;
        for(int row = 0;row < matrix.length / 2;row++){ 

            for(int col = 0;col < (matrix.length+1) /2 ;col++){
                int temp = matrix[row][col];
                matrix[row][col] =matrix[n-col-1][row];
                matrix[n-col-1][row]   = matrix[n-row-1][n-col-1];
                matrix[n-row-1][n-col-1] = matrix[col][n-row-1];
                matrix[col][n-row-1] = temp;
            }
            //   int temp = matrix[row][col];
            //     matrix[row][col] = matrix[col][n-row-1];
            //     matrix[col][n-row-1] = matrix[n-row-1][n-col-1];
            //     matrix[n-row-1][n-col-1] = matrix[n-col-1][row];
            //     matrix[n-col-1][row] = temp;
        }
    }
}

