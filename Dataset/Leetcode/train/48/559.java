 class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        if(n < 2) return;
        int fn = n - 1;
        for(int i = 0 ; i < fn ; i++) {
            for(int j = i ; j < fn - i ; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[fn-j][i];
                matrix[fn-j][i] = matrix[fn-i][fn-j];
                matrix[fn-i][fn-j] = matrix[j][fn-i];
                matrix[j][fn-i] = tmp;
            }
        }
    }
}

