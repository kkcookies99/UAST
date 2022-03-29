 int** XXX(int numRows, int* returnSize, int** returnColumnSizes){
    *returnSize=numRows;
    int**ret=(int**)malloc(numRows*sizeof(int*));
    int i=0,j=0;
    for(i=0;i<numRows;i++){
        ret[i]=(int*)malloc((i+1)*sizeof(int));
        returnColumnSizes[i]=(int*)malloc(sizeof(int));
        *(returnColumnSizes[i])=(i+1);
        ret[i][0]=1;
        ret[i][i]=1;
        for(j=1;j<i;j++){
            ret[i][j]=ret[i-1][j-1]+ret[i-1][j];
        }
    }
    return ret;
}

