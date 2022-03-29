public void XXX(int[][] matrix) {
        int len = matrix.length;
        int count = len >> 1;
        for (int i = 0; i < count; i++) {
            for (int j = i; j < len - i-1; j++) {
                transfer(len, matrix, i, j, matrix[i][j], 0);
            }
        }
    }

    void transfer(int len, int[][] matrix, int x, int y, int t, int n) {
        if (n > 3) {
            return;
        }
        int newY = len - x - 1;
        int temp = matrix[y][newY];
        matrix[y][newY] = t;
        transfer(len, matrix, y, newY, temp, n + 1);
    }

