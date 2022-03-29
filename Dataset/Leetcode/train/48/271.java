class Solution {
    public void XXX(int[][] matrix) {
        int times = (matrix.length + 1) / 2;
        for (int i = 0; i < times; i++) {
            int l = (matrix.length - 2 * i) - 1;
            for (int k = 0; k < l; k++) {
                int temp = matrix[i][i + k];
                matrix[i][i + k] = matrix[l + i - k][i];
                matrix[l + i - k][i] = matrix[l + i][l + i - k];
                matrix[l + i][l + i - k] = matrix[i + k][l + i];
                matrix[i + k][l + i] = temp;
            }
        }
    }
}

