int** XXX(int* nums, int numsSize, int* returnSize, int** returnColumnSizes){
    int resultSize = 1;
    for (int i = 0; i < numsSize; i++) {
        resultSize *= 2;
    }
    
    int **result = calloc(resultSize, sizeof(int *));
    int *resultColumnSizes = calloc(resultSize, sizeof(int));
    for (int i = 0; i < resultSize; i++) {
        int *column = calloc(numsSize, sizeof(int));
        int columnSize = 0;

        int bin = i, bitIndex = 0;
        while (bin > 0) {
            if (bin % 2 > 0) {
                column[columnSize] = nums[bitIndex];
                columnSize++;
            }
            bin = bin >> 1;
            bitIndex++;
        }

        result[i] = column;
        resultColumnSizes[i] = columnSize;
    }

    *returnSize = resultSize;
    *returnColumnSizes = resultColumnSizes;
    return result;
}

