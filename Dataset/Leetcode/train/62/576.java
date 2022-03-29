class Solution {
    public int XXX(int m, int n) {
        int[][] tmp = new int[n + 1][m + 1];
        for (int i = 0; i < m + 1; i++) {
            tmp[1][i] = 1;
        }
        for (int i = 0; i < n + 1; i++) {
            tmp[i][1] = 1;
        }
        for (int i = 2; i < n + 1; i++) {
            for (int j = 2; j < m + 1; j++) {
                tmp[i][j] = tmp[i - 1][j] + tmp[i][j - 1];
            }
        }
        return tmp[n][m];
    }
}

