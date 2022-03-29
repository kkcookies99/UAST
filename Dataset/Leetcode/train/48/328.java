class Solution {
    public void XXX(int[][] matrix) {
        int n=matrix.length;
        int[][] temp = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                temp[i][j]=matrix[i][j];
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                matrix[j][i]=temp[i][j];
        }
        int p=0, q=n-1, tp;
        while(p<q){
            for(int i=0;i<n;i++){
                tp=matrix[i][p];
                matrix[i][p]=matrix[i][q];
                matrix[i][q]=tp;
            }
            p++;
            q--;
        }
    }
}

