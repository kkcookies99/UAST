 class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
            
        int level = 0;
        while (level < matrix.length / 2) {

            int i = level;
            for (int j = level; j < n - level - 1; j++) {

                    int tmp = matrix[i][j];

                    matrix[i][j] = matrix[n - j - 1][i];

                    matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];

                    matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];

                    matrix[j][n - i - 1] = tmp;
            }

            level++;

        }
    }
}

