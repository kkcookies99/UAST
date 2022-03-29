 class Solution {
    public void XXX(int[][] matrix) {
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix.length; j++) {
                temp = matrix[j][i];
                matrix[j][i] = matrix[j][matrix.length - i - 1];
                matrix[j][matrix.length - i - 1] = temp;
            }
        }
    }
}

