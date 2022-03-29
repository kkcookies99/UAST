class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        //右对角线翻转，只需要交换横纵坐标即可
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(i != j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        //水平翻转，纵坐标不变，横坐标取差
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}

