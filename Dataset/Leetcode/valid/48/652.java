 class Solution {
    public void XXX(int[][] matrix) {
        int len = matrix.length - 1;
        int borderX = (matrix.length/2);
        int border = (matrix.length/2) + (matrix.length%2);
        for (int i = 0; i < borderX; i++) {
            for (int j = 0; j < border; j++) {
                int x = i, y = j;
                int temp = matrix[x][y], next = 0;
                x = len - x;
                next = matrix[y][x];
                matrix[y][x] = temp;
                temp = next;

                y = len -y;
                next = matrix[x][y];
                matrix[x][y] = temp;
                temp = next;

                x = len - x;
                next = matrix[y][x];
                matrix[y][x] = temp;
                temp = next;

                y = len -y;
                matrix[x][y] = temp;
            }
        }
    }
}

