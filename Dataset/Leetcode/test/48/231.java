class Solution {
    public void XXX(int[][] matrix) {
        int[][] flag = new int[matrix.length][matrix.length];

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix.length; j++) {
                flag[i][j] = matrix[i][j];
            }
        }

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix.length; j++) {
                matrix[j][i] = flag[matrix.length-1-i][j];
            }
        }
    }
}

