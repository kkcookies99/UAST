class Solution {
    public int XXX(int m, int n) {
        int[][] road = new int[n][m];

        for (int i = 0; i < n; i++) {
            road[i][0] = 1;
            road[i][m - 1] = 1;
        }

        for (int i = 0; i < m; i++) {
            road[0][i] = 1;
            road[n - 1][i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                road[i][j] = road[i - 1][j] + road[i][j - 1];
            }
        }

        return road[n - 1][m - 1];
    }
}

