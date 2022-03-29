class Solution {
    public void XXX(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return;
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }
    }
}

