 class Solution {
    public void XXX(int[][] matrix) {
        int length = matrix.length;
        int index = length - 1;
        for(int i = 0; i < length / 2; i++) {
            for(int j = i; j < index - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[index - j][i];
                matrix[index - j][i] = matrix[index - i][index - j];
                matrix[index - i][index - j] = matrix[j][index - i];
                matrix[j][index - i] = temp;
            }
        }
    }
}

