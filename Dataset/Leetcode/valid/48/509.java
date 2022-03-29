 class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix, i, j, j, i);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n - 1; j < k; j++, k--) {
                swap(matrix, i, j, i, k);
            }
        }
    }
    void swap(int[][] matrix, int a, int b, int x, int y) {
        int c = matrix[a][b];
        matrix[a][b] = matrix[x][y];
        matrix[x][y] = c;
    }
}

