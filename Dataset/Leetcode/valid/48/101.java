class Solution {
    public void XXX(int[][] matrix) {
        boolean [][] visited = new boolean[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(!visited[i][j]){
                    swap(i, j, j, matrix.length - 1 - i, matrix);
                    visited[j][matrix.length - 1 - i] = true;
                }
            }
        }
    }

    void swap(int i, int j, int ni, int nj, int[][] matrix){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[ni][nj];
        matrix[ni][nj] = temp;
    }
}

