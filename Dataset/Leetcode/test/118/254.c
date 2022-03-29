 int** XXX(int numRows, int* returnSize, int** returnColumnSizes){
    int **result = (int**)malloc(sizeof(int*) * numRows);
    *returnSize = numRows;
    *returnColumnSizes = (int*)malloc(sizeof(int) * (*returnSize));
    for(int i=0; i<numRows; i++) {
        result[i] = (int*)malloc(sizeof(int) * (i+1));
        result[i][0] = 1;
        result[i][i] = 1;
        *((*returnColumnSizes)+i) = i+1;
    }
    for(int i=2; i<numRows; i++) {
        for(int j=1; j<i; j++) {
            result[i][j] = result[i-1][j-1] + result[i-1][j];
        }
    }
    return result;
}

