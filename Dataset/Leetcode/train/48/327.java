class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        for (int i=0; i<n/2; i++) {
            for (int j=i; j<n-i-1; j++) {
                    int temp = matrix[j][n-i-1];
                    matrix[j][n-i-1] = matrix[i][j];
                    int pre = temp;

                    temp = matrix[n-i-1][n-j-1];
                    matrix[n-i-1][n-j-1] = pre;
                    pre = temp;

                    temp = matrix[n-j-1][i];
                    matrix[n-j-1][i] = pre;
                    pre = temp;

                    matrix[i][j] = pre;
            }
        }
    }

}

