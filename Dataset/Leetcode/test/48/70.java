class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<(n+1)/2;i++) {
            for(int j=0;j<n/2;j++) {
                exchange(matrix, i, j , n);
            }
        }
    }
    private void exchange(int[][] matrix, int i, int j,int n) {
        int m = matrix[j][n-i-1];
        matrix[j][n-i-1] = matrix[i][j];
        int k = matrix[n-i-1][n-j-1];
        matrix[n-i-1][n-j-1] = m;
        m = matrix[n-j-1][i];
        matrix[n-j-1][i] = k;
        matrix[i][j] = m;
    }
}


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


