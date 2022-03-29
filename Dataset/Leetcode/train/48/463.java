 class Solution {
    public void XXX(int[][] matrix) {
   //(i,j)换到了(j,n-i-1)的位置?关键在于如何交换，存储下(i,j)本来的元素
    int m=matrix.length;
    int n=matrix[0].length;
    for(int i=0;i<m/2;i++){
      for(int j=0;j<(n+1)/2;j++){
        int temp=matrix[i][j];//存储下matrix[i][j]的位置
        matrix[i][j] = matrix[n - j - 1][i];//找到谁变成了i,j的位置
        matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
        matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
        matrix[j][n - i - 1] = temp;

      }
   }
   }
}

