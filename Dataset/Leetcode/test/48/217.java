class Solution {
    public void XXX(int[][] matrix) {
        // n x n
        int length = matrix.length;
        int j = 0, k = length - 1;
        for (int i = 0; i < length / 2; i++) {
            for (int s = j, e = k; s < e; s++) {
                int a = s;
                int b = s;
                int c = length - s - 1;
                int d = length - s - 1;
                swap(matrix, j, k, a, b, c, d);
            }
            ++j;
            --k;
        }
    }

    private void swap(int[][] matrix, int l, int r, int a, int b, int c, int d) {
        int temp = matrix[l][a];
        matrix[l][a] = matrix[d][l];
        matrix[d][l] = matrix[r][c];
        matrix[r][c] = matrix[b][r];
        matrix[b][r] = temp;
    }
}

