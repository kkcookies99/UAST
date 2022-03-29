class Solution {
    public void XXX(int[][] matrix) {
        if (matrix == null || matrix.length < 1 || matrix[0].length <= 1) {
            return;
        }
        int start = 0;
        for (int n = matrix.length; n >= 0; n = n - 2) {
            helper(matrix, start++, n);
        }
    }

    public void helper(int[][] matrix, int start, int n) {
        if (n <= 0) {
            return;
        }

        int[] temp = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            temp[i] = matrix[start + i + 1][start];
            matrix[start + i + 1][start] = matrix[start + n - 1][start + i + 1];
            matrix[start + n - 1][start + i + 1] = matrix[start + n - i - 2][start + n - 1];
            matrix[start + n - i - 2][start + n - 1] = matrix[start][start + n - i - 2];
            matrix[start][start + n - i - 2] = temp[i];
        }

    }
}

