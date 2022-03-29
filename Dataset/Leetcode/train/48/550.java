 class Solution {
    public void XXX(int[][] matrix) {
        int len = matrix.length;
        int [][] tmp= new int[len][len];
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                tmp[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                matrix[j][i]=tmp[len-1-i][j];
            }
        }
    }
}

