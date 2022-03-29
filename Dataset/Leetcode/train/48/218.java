class Solution {
    public void XXX(int[][] matrix) {
        int len = matrix.length - 1;
        int layer = matrix.length / 2 - 1;
        int temp;
        for (int i = 0; i <= layer; i++) {
            for (int j = i; j < len - i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[len - j][i];
                matrix[len - j][i] = matrix[len - i][len - j];
                matrix[len - i][len - j] = matrix[j][len - i];
                matrix[j][len - i] = temp;
            }
        }
    }
}

