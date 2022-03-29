class Solution {
    public void XXX(int[][] matrix) {
        
        int n = matrix.length;
        //对角线反转
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix, i, j, j, i);
            }
        }

        //列镜像置换
        for (int j = 0; j < n / 2; j++) {
            for (int i = 0; i < n; i++) {
                swap(matrix, i, j, i, n - 1 - j);
            }
        }
        

    }


    public void swap(int[][] m, int ai, int aj, int bi, int bj) {
        int t = m[ai][aj];
        m[ai][aj] = m[bi][bj];
        m[bi][bj] = t;
    }
}

