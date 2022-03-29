 class Solution {
    public void XXX(int[][] matrix) {
        if(matrix.length < 2)
            return;
        
        upDown(matrix);
        diagonal(matrix);
    }

    private void upDown(int[][] matrix){
        for(int i = 0; i < matrix.length/2; i++){
            for(int j = 0; j < matrix.length; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - i][j];
                matrix[matrix.length - 1 - i][j] = tmp;
            }
        }
    }
    
    private void diagonal(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = i+1; j < matrix.length; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}
