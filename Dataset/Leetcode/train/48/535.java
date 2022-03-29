 class Solution {
    public void XXX(int[][] matrix) {
        int len = matrix.length;
        int high = len/2;
        for(int i = 0 ; i < high ; i++){
            for(int j = i ; j < len - 1 - i ; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[len - 1 - j][i];
                matrix[len - 1 - j][i] = matrix[len - 1 - i][len - 1 - j];
                matrix[len - 1 - i][len - 1 - j] = matrix[j][len - 1 - i];
                matrix[j][len - 1 - i] = t;
            }
        }
    }
}

