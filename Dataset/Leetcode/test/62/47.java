 class Solution {
    public int XXX(int m, int n) {
        int[][] arr = new int[n][m];
        arr[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                } else if (i == 0 && j != 0) {
                    arr[i][j] = arr[i][j - 1];
                } else if (j == 0 && i != 0) {
                    arr[i][j] = arr[i - 1][j];
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }

            }
        }
        return arr[n - 1][m - 1];
    }
}
