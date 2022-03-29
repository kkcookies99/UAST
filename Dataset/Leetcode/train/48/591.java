 class Solution {
    public void XXX(int[][] matrix) {
        int row = matrix.length;
        if(row==0){return;}
        int column = matrix[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<column/2;j++){
                 int temp = matrix[i][j];
                 matrix[i][j] = matrix[i][column-j-1] ;
                 matrix[i][column-j-1]  = temp;
            }
        }

    }
}

