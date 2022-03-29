 class Solution {
    public void XXX(int[][] matrix) {
        f(matrix, 0, matrix.length - 1, matrix.length - 1);
    }
    public void f(int[][] matrix, int start, int end, int n) {
        if(start >= end) {
            return;
        }
        for(int i = 0; i < n; i++) {
            int t = matrix[start][start + i];
            matrix[start][start + i] = matrix[end - i][start];
            matrix[end - i][start] = matrix[end][end - i];
            matrix[end][end - i] = matrix[start + i][end];
            matrix[start + i][end] = t;
        }
        f(matrix, start + 1, end - 1, n - 2);
    }
}

