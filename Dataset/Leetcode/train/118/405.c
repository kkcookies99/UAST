 int** XXX(int numRows, int* returnSize, int** returnColumnSizes){
    int** results = (int**)malloc(sizeof(int*)*numRows);
    if(numRows==0){
        (*returnSize)=numRows;
        return results;
    }
    (*returnColumnSizes)=(int*)malloc(sizeof(int)*numRows);
    (*returnColumnSizes)[0]=1;
    (*returnSize)=numRows;
    results[0]=(int*)malloc(sizeof(int));
    results[0][0]=1;
    for(int i=1;i<numRows;i++){
        (*returnColumnSizes)[i]=i+1;
        results[i]=(int*)malloc(sizeof(int)*(i+1));
        for(int j=0;j<i+1;j++){
            if(j-1>=0){
                results[i][j]=results[i-1][j-1];
            }else{
                results[i][j]=0;
            }
            if(j<i){
                results[i][j]+=results[i-1][j];
            }
        }
    }
    return results;
}

