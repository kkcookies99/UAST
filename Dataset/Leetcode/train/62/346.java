 class Solution {
    public int XXX(int m, int n) {
        int[][] graph = new int[m][n];
        for (int i = n - 1; i >= 0; i--) {
            graph[m-1][i] = 1;
        }
        for (int i = m - 1; i >= 0; i--) {
            graph[i][n-1] = 1;
        }
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                graph[i][j] = graph[i][j+1] + graph[i+1][j];
            }
        }
        return graph[0][0];
    }
}

