 class Solution {
    public void XXX(int[][] matrix) {
        for(int i = 0;i<matrix.length;i++){
            for(int j = i+1;j<matrix.length;j++){
                if(i!=j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        for(int i = 0,j = matrix[0].length-1;i<j;i++,j--){
            for(int k = 0;k<matrix.length;k++){
                int temp = matrix[k][i];
                matrix[k][i] = matrix[k][j];
                matrix[k][j] = temp;
            }
        }
    }
}

