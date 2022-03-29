 int** XXX(int numRows, int* returnSize, int** returnColumnSizes){
    //返回的是二维数组，所以需要保存每一行的信息
    *returnSize = numRows;
    *returnColumnSizes = (int *)malloc(sizeof(int)*numRows);//returnColumnSizes储存杨辉三角每一行元素的个数
    int** res = (int**)malloc(sizeof(int*)*numRows);
    
    for (int i = 0; i < numRows; i++) {
        (*returnColumnSizes)[i] = i+1;
        res[i] = (int*)malloc(sizeof(int)*(i+1));
        res[i][0] = 1;
        res[i][i] = 1;
        for (int j = 1; j < i; j++) {
            res[i][j] = res[i-1][j] + res[i-1][j-1]; 
        }
    }
    return res;
}

