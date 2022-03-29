class Solution {
    public void XXX(int[][] matrix) {
        int len = matrix.length;
        for(int a = 0;a < len / 2;a++){
            for(int i = a, len2 = len - a - 1;i < len2;i++){
               int t = matrix[len - a - 1][len - i - 1];
               matrix[len - a - 1][len - i - 1] = matrix[i][len - a -1];
               matrix[i][len - a -1] = matrix[a][i];
               matrix[a][i] = matrix[len - i - 1][a];
               matrix[len - i - 1][a] = t;
            }
        }
    }
}

