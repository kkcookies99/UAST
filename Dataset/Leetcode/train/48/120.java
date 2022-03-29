class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        int l = 0, r = n - 1, t = 0, b = n - 1;
        for (int i = n; i > 1; i -= 2) {
            int[] tmp = new int[i];
            for (int j = 0; j < i - 1; j++) tmp[j] = matrix[b - j][l];
            for (int j = 0; j < i - 1; j++) {
                int temp = tmp[j];
                tmp[j] = matrix[t][l + j];
                matrix[t][l + j] = temp;
            }
            for (int j = 0; j < i - 1; j++) {
                int temp = tmp[j];
                tmp[j] = matrix[t + j][r];
                matrix[t + j][r] = temp;
            }
            for (int j = 0; j < i; j++) {
                int temp = tmp[j];
                tmp[j] = matrix[b][r - j];
                matrix[b][r - j] = temp;
            }
            for (int j = 0; j < i - 1; j++) {
                int temp = tmp[j];
                tmp[j] = matrix[b - j][l];
                matrix[b - j][l] = temp;
            }
            l++; r--; t++; b--;
        }
    }
}

