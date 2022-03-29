 class Solution {
    public void XXX(int[][] matrix) {
        int row = matrix.length;
		// first find the transpose of the matrix.
		for (int i = 0; i < row; i++) {
			for (int j = i; j < row; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		// reverse each row
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][row - 1 - j];
				matrix[i][row - 1 - j] = temp;
			}
		}
    }
}

