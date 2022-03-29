 int** XXX(int numRows, int* returnSize, int** returnColumnSizes){
    *returnSize = numRows;
    *returnColumnSizes = malloc(sizeof(int) * numRows);
    int** ans = malloc(sizeof(int*) * numRows);
    for (int i = 0; i < numRows; i++) {
        (*returnColumnSizes)[i] = i+1;
        ans[i] = malloc(sizeof(int) * (i+1));   //第i行有i+1个元素
    }
    for(int i=0;i<numRows;i++){
        ans[i][0]=1;    //任意一行的头元素和尾元素都是1
        ans[i][i]=1;
        for(int j=1;j<i;j++){   //第i行有i+1个元素,只需要将第1到第i个元素赋值即可
            ans[i][j]=ans[i-1][j-1]+ans[i-1][j]; //杨辉三角的递推关系式
        }
    }
    return ans;
}

