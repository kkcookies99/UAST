class Solution {
    public void XXX(int[][] matrix) {
        /**
        由外层向里层依次进行旋转，i 递增表示向里层遍历 0<=i<n/2;
        对于第i层，j递增 表示向右遍历， i<=j<matrix.length-1 - i;
        对于每一层，我们依次对元素matrix[i][j]进行顺时针旋转即可，旋转规则如下：
        matrix[i][j] = matrix[n-1-j][i];
        matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
        matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
        matrix[j][n-1-i] = temp;
         */
        int n = matrix.length;
        for(int i=0; i<n/2; i++){
            int m = n-i-1;
            for(int j=i; j<m; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }
 
    }
}

