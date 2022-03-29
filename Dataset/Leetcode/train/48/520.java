 class Solution {
    public void XXX(int[][] matrix) {
        // 上下交换
        int len = matrix.length;
        for (int i = 0; i < len / 2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[len - 1 - i];
            matrix[len - 1 - i] = temp;
        }

        // 对角交换
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                // 只交换右上角的三角区域
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}

