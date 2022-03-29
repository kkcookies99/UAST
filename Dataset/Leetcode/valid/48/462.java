 class Solution {
    public void XXX(int[][] matrix) {
        if(matrix==null||matrix.length==0) {
            return;
        }
        int n = matrix.length;
        //先做对角线反转
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        //再做左右对称反转
        int mid = (n%2==0)? (n-1)/2 : n/2;
        for(int i=0;i<n;i++) {
            for(int j=0;j<=mid;j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = tmp;
            }
        }
    }
}

