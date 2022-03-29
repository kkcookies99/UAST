class Solution {
    public void XXX(int[][] matrix) {
        if(matrix.length == 1){
            return;
        }
        int len =matrix.length;
        int j = len-1;
        int k = 0;
        while(j > k){
          
            for(int i=0; i<(j-k);i++){
                int[] tmp = new int[4];
                tmp[0] = matrix[k][k+i];
                tmp[1] = matrix[k+i][j];
                tmp[2] = matrix[j][j-i];
                tmp[3] = matrix[j-i][k];
                
                matrix[k][k+i] = tmp[3];
                matrix[k+i][j] = tmp[0];
                matrix[j][j-i] = tmp[1];
                matrix[j-i][k] = tmp[2];
            }
            k++;
            j--;
        }
    }
}

