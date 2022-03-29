class Solution {
    public void XXX(int[][] matrix) {
        int length = matrix.length;
        int maxIndex = (length - 1) / 2;
        int num = length / 2 - 1;
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= maxIndex; j++) {
                int temp = matrix[i][j];
                int x = i;
                int y = j;
                for (int k = 0; k < 3; k++) {
                    int preX = length - 1 - y;
                    int preY = x;
                    matrix[x][y] = matrix[preX][preY];
                    x = preX;
                    y = preY;
                }
                matrix[x][y] = temp;
            }
        }
    }
}

