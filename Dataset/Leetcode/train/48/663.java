 class Solution {
    public void XXX(int[][] matrix) {
        
        int n = matrix.length;
        int border = (int) Math.ceil(n/2);
        if(n<2) {
            return;
        }else {
            for(int i=0; i<border; i++) {
                for(int j=i; j<n-i-1; j++) {
//                    循环替换四个
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[n-1-j][i];
                    matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                    matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                    matrix[j][n-1-i] = tmp;     
                }
            }
        }
    
    }
}

