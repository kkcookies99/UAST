 class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n/2;i++){
            for(int j = i;j<n-1-i;j++){
                swap(matrix,i,j,j,n-1-i);
                swap(matrix,i,j,n-1-i,n-1-j);
                swap(matrix,i,j,n-1-j,i);
            }
        }
    }

    public void swap(int[][] matrix,int a,int b,int c,int d){
        int tmp = matrix[a][b];
        matrix[a][b] = matrix[c][d];
        matrix[c][d] = tmp;
    }
}


