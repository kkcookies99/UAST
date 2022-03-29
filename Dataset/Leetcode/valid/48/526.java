 class Solution {
    public void XXX(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            int n = matrix.length - 2 * i - 1;
            for (int j = 0; j < n; j++) {
                swap(matrix, j, 0, 0, n - j, i);
                swap(matrix, n, j, j, 0, i);
                swap(matrix, n - j, n, n, j, i);
            }
        }
    }

    /**
     * 交换二维数组中的两个数
     * @param i 偏移量
     */
    private void swap(int[][] matrix, int x1, int y1, int x2, int y2, int i) {
        int tmp = matrix[x1 + i][y1 + i];
        matrix[x1 + i][y1 + i] = matrix[x2 + i][y2 + i];
        matrix[x2 + i][y2 + i] = tmp;
    }
}

