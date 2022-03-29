 class Solution {
    public void XXX(int[][] matrix) {
        int[][] cp = new int[matrix.length][matrix.length];
        for(int i = 0; i < matrix.length; i++) 
            for(int j = 0; j < matrix.length; j++) 
                cp[j][matrix.length - i - 1] = matrix[i][j];
        for(int i = 0; i < matrix.length; i++) 
            for(int j = 0; j < matrix.length; j++) 
                matrix[i] = cp[i];
    }
}

