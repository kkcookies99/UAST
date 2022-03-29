class Solution {
    public void XXX(int[][] matrix) {
        int[][] matrixNew=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrixNew[matrix.length-j-1][matrix.length-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=matrixNew[matrix.length-i-1][j];
            }
        }
    }
}

