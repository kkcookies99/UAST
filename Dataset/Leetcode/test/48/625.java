 class Solution {
    public void XXX(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int[] mat : matrix) {
            for (int i = 0; i < mat.length / 2; i++) {
                int temp = mat[i];
                mat[i] = mat[mat.length - 1 - i];
                mat[mat.length - 1 - i] = temp;
            }
        }
    }
}

