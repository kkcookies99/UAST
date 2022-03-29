class Solution {
    public void XXX(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) return;
        int l = 0, n = matrix.length, r = n - 1, i = 0; // l左边界，r有边界，n长度，i层级
        while(l<r) {
            for(int j=l; j<r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
            l++;
            r--;
            i++;
        }
    }
}

