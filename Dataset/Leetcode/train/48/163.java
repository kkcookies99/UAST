class Solution {
    public void XXX(int[][] matrix) {
        int len =matrix.length-1;
        for (int i = 0; i <= len; i+=1) {
            for (int j = i; j <= len-(1+i); j+=1) {
                int t=matrix[i][j];
                // 0行0列的开始转换 n 0
                matrix[i][j]=matrix[len-j][i];
                // n 0 ->n n
                matrix[len-j][i]=matrix[len-i][len-j];
                // n n ->0 n
                matrix[len-i][len-j]=matrix[j][len-i];
                // 0 n -> 0 0
                matrix[j][len-i]=t;
            }
        }
    }
}

