class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        if(n == 1) return;
        for(int row = 0; row < n; row++) {
            for(int col = n - 1; col >= n - 1 - row; col--) {
                int temp = matrix[n - 1 - col][n - 1 - row];
                matrix[n - 1 - col][n - 1 - row] = matrix[row][col];
                matrix[row][col] = temp;
            }
        }
        for(int row = 0; row < n / 2; row++) {
            int[] temp = matrix[row];
            matrix[row] = matrix[n - 1 - row];
            matrix[n - 1 - row] = temp;
        }
    }
}

