 int** XXX(int numRows, int* returnSize, int** returnColumnSizes){
    int **a=(int **)malloc(numRows*sizeof(int *));  //二级指针（指向数组的指针），相当于开辟numRows行
    *returnColumnSizes=(int *)malloc(numRows*sizeof(int));
    for(int i=0;i<numRows;i++)
    {
        a[i]=(int *)malloc((i+1)*sizeof(int));  //一级指针，开辟每一列
        (*returnColumnSizes)[i]=i+1;
    }
    for(int i=0;i<numRows;i++)
    {
        a[i][0]=1;
        a[i][i]=1;
        if(i>=2)
        {
            for(int j=1;j<i;j++)
                a[i][j]=a[i-1][j-1]+a[i-1][j];
        }
    }
    *returnSize=numRows;
    return a;
}

