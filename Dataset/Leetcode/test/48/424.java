 class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length - 1;
        int tmp;
        int i2 = 0;
        int j2 = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                j2 = n - j;
                tmp = matrix[i][j];
                matrix[i][j] = matrix[i][j2];
                matrix[i][j2] = tmp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                i2 = n - j;
                j2 = n - i;
                tmp = matrix[i][j];
                matrix[i][j] = matrix[i2][j2];
                matrix[i2][j2] = tmp;
            }
        }
    }
}

