class Solution {
    public void XXX(int[][] matrix) {
        int n  = matrix.length;
        int[][] new_matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                new_matrix[j][n-i-1] = matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                matrix[i][j] = new_matrix[i][j];
            }
        }

    }
}

