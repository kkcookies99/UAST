 class Solution {
    public void XXX(int[][] matrix) {
        if(matrix.length == 0) return;
        int rowNum = matrix.length;
        int colNum = matrix[0].length;
        int temp;
        for(int i=0; i < rowNum; i++){
            for(int j=i+1; j < colNum; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i < rowNum; i++){
            for(int j=0; j < colNum / 2; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][colNum - 1 - j];
                matrix[i][colNum - 1 - j] = temp;
            }
        }
    }
}

