public void XXX(int[][] matrix) {
    int len = matrix.length;
    int rowLen = len/2;
    int colLen = len/2 + len%2;
    for (int row = 0; row < rowLen; row++) {
        for (int col = 0 ; col < colLen; col++) {
            int temp = matrix[row][col];
            matrix[row][col] = matrix[len-col-1][row];
            matrix[len-col-1][row] = matrix[len-row-1][len-col-1];
            matrix[len-row-1][len-col-1] = matrix[col][len-row-1];
            matrix[col][len-row-1] = temp;
        }
    }
}

