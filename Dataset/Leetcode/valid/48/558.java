 class Solution {
    public void XXX(int[][] matrix) {
        // 转置 再 对称反转
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length/2; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length-1-j];
                matrix[i][matrix[0].length-1-j] = t;
            }
        }
    }
}

