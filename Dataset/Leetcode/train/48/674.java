 class Solution {
    public void XXX(int[][] matrix) {
        int len = matrix.length;
        for (int j = 0; j < len / 2; j++) {
            for (int i = j; i < len - 1 - j; i++) {
                int tmp1 = matrix[j][i];
                int tmp2 = matrix[i][len - 1 - j];
                int tmp3 = matrix[len - 1 - j][len - 1 - i];
                int tmp4 = matrix[len - 1 - i][j];

                matrix[j][i] = tmp4;
                matrix[i][len - 1 - j] = tmp1;
                matrix[len - 1 - j][len - 1 - i] = tmp2;
                matrix[len - 1 - i][j] = tmp3;
            }
        }
    }
}

