 class Solution {
    public void XXX(int[][] matrix) {
        int len = matrix.length;
        //按照对角线（/）将元素交换
        for (int i = 0; i < len-1; i++) {
            for (int j = len-2-i; j >= 0; j--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len-1-j][len-1-i];
                matrix[len-1-j][len-1-i] = temp;
            }
        }
        //将元素按照i=len/2的水平线进行交换
        for (int i = 0; i < len/2; i++) {
            for (int j = 0; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len-1-i][j];
                matrix[len-1-i][j] = temp;
            }
        }
    }
}

