class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;

        //转置
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n ; j++) {
                //System.out.println(matrix[i][j]);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //对称
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            for (int k = 0; k < n; k++) {
                int temp = matrix[k][i];
                matrix[k][i] = matrix[k][j];
                matrix[k][j] = temp;
            }
        }

    }
}


