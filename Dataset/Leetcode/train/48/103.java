class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        int nums = 0;
        for (int j = 0; j < n / 2; j++) {
            for (int i = j; i < n - 1 - j; i++) {
                int num = matrix[j][i];
                int p1 = n - i - 1;
                int p2 = n - j - 1;
                matrix[j][i] = matrix[p1][j];
                matrix[p1][j] = matrix[p2][p1];
                matrix[p2][p1] = matrix[i][p2];
                matrix[i][p2] = num;
            }
        }
        
    }
}

