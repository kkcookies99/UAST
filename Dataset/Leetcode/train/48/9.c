void XXX(int** matrix, int matrixSize, int* matrixColSize){
    //先转置矩阵
    for (int i = 0; i < matrixSize; ++i)
        for (int j = 0; j < i; ++j){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    
    //再镜像对称
    int left = 0;
    int right = matrixSize - 1;
    while (left < right){
        for (int i = 0; i < matrixSize; ++i){
            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp;
        }
        left++;
        right--;
    }   
}

