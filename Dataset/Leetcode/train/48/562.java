 class Solution {
    public void XXX(int[][] matrix) {
        int len = matrix.length, n = len / 2, t;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < len - i - 1; j++) {
                int a = len - j - 1, b = len - i - 1;
                t = matrix[i][j];
                matrix[i][j] = matrix[a][i];
                matrix[a][i] = matrix[b][a];
                matrix[b][a] = matrix[j][b];
                matrix[j][b] = t;
            }
        }
    }
}

