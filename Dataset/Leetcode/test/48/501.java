 class Solution {
    public void XXX(int[][] matrix) {
        int len = matrix.length;
        int temp = 0;
        for(int i =0; i < len; i++){
            for(int j = i+1; j< len; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int i=0; i < len; i++){
            for(int j=0; j < len/2; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][len-1-j];
                matrix[i][len-1-j] = temp;
            }
        }

    }
}

