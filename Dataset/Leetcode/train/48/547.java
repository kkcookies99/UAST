 class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        int l = 0, t = 0, r = n - 1, b = n - 1;//left, top, right, bottom 分别初始化为矩阵的边界
        while (l < r && t < b) {
            for (int i = 0; i < (r - l); i++) {
                int tmp = matrix[t][l + i];
                matrix[t][l + i] = matrix[b - i][l];
                matrix[b - i][l] = matrix[b][r - i];
                matrix[b][r - i] = matrix[t + i][r];
                matrix[t + i][r] = tmp;
            }
            l++;
            r--;
            t++;
            b--;
        }
    }
}

