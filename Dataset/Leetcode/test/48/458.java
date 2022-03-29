 class Solution {
    public void XXX(int[][] matrix) {
        if(matrix.length==1){
            return;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                swap(matrix,i,j,j,i);
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length/2;j++){
                swap(matrix,i,j,i,matrix[0].length-1-j);
            }
        }
    }

    private void swap(int[][] grid,int i,int j,int m,int n){
        int temp=grid[i][j];
        grid[i][j]=grid[m][n];
        grid[m][n]=temp;
    }
}

