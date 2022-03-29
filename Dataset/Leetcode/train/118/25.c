 int** XXX(int numRows, int* returnSize, int** returnColumnSizes){
        
        int** a = malloc(sizeof(int*) * numRows);
        //int a[numRows+1][numRows+1];
        *returnSize=numRows;
        *returnColumnSizes = malloc(sizeof(int) * numRows);
       for(int i=0;i<numRows;i++){
          a[i] = malloc(sizeof(int) * (i + 1));
           (*returnColumnSizes)[i]=i+1;
           a[i][0] = a[i][i] = 1;
           for(int j=1;j<i;j++){
            a[i][j]=a[i-1][j]+a[i-1][j-1];
           }
       }
       return a;
}

