void XXX(int** matrix, int matrixSize, int* matrixColSize){
    int row, col, t;

    for (row = 0; row < matrixSize; row++) {
        for (col = row; col < *matrixColSize; col++) {
            t = matrix[row][col];
            matrix[row][col] = matrix[col][row];
            matrix[col][row] = t;
        }
    }

    for (row = 0; row < matrixSize; row++) {
        for (col = 0; col < *matrixColSize / 2; col++) {
            t = matrix[row][col];
            matrix[row][col] = matrix[row][*matrixColSize - 1 - col];
            matrix[row][*matrixColSize - 1 - col] = t;
        }
    }
}

