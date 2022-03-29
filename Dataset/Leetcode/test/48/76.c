void XXX(int** matrix, int matrixSize, int* matrixColSize){
    int tmp;
    int i,j;
    for(i=0;i<matrixSize;i++)
        for(j=i;j<matrixSize;j++){
            tmp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = tmp;
        }    
    
    for(i=0; i<matrixSize; i++)
        for(j=0; j<=(matrixSize-1)/2; j++){
            tmp = matrix[i][j];
            matrix[i][j] = matrix[i][matrixSize-1-j];
            matrix[i][matrixSize-1-j] = tmp;
        }            
}

