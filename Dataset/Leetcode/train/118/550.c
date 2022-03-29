 int** XXX(int numRows, int* returnSize, int** returnColumnSizes){
    int **ret = malloc(sizeof(int*) * numRows);

    *returnColumnSizes = malloc(sizeof(int) * numRows);
    for (int i = 0;  i < numRows; i++) {
        (*returnColumnSizes)[i] = i + 1;
        ret[i] = malloc(sizeof(int) * (i + 1));
        ret[i][0] = 1;
        ret[i][i] = 1;
        for (int j = 1; j < i; j++)
            ret[i][j] = ret[i - 1][j - 1] + ret[i - 1][j];
    }
    *returnSize = numRows;
    return ret;
}

