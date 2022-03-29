class Solution {
    public void XXX(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for(int i = 0; i < m; i++){
            int[] tmp = matrix[i];
            for(int a = 0, b = n - 1; a < b; a++, b--){
                int val = tmp[a];
                tmp[a] = tmp[b];
                tmp[b] = val;
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n - i; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[m - 1 - j][n - 1 - i];
                matrix[m - 1 - j][n - 1 - i] = tmp;
            }
        }
    }
}

