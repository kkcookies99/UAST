class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        boolean[][] checked = new boolean[n][n];
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j ++){
                int x = i, y = j;
                int curr = matrix[x][y];
                while (!checked[x][y]){
                    int next = matrix[y][n-x-1];
                    matrix[y][n-x-1] = curr;
                    checked[x][y] = true;
                    int temp = y;
                    y = n - x -1;
                    x = temp;
                    curr = next;
                }
            }
        }
    }
}

