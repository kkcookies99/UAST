 class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        int i=0;
        int j=n-1;
        while(i<j) {
            for(int k=i;k<j;k++) {
                int offset = k-i;
                int tmp = matrix[i][k];
                matrix[i][k] = matrix[j-offset][i];
                matrix[j-offset][i] = matrix[j][j-offset];
                matrix[j][j-offset] = matrix[k][j];
                matrix[k][j] = tmp;
            }
                
            i++;
            j--;
        } 
    }
}

