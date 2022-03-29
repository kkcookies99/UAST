 class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        if(n <= 1)return ;
        //矩阵转置
        for(int i=0;i<n;i++)
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        //将每一行反转
        for(int i=0;i<n;i++){
            for(int j=0;j<(n/2);j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
}

