class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) { // 遍历层数从 0 ~ [n / 2] - 1
            for (int j = i; j < n - i - 1; j++) { // 每层遍历元素列标从 i ~ n - i - 2
                int temp = matrix[i][j];
                int x = i;
                int y = j;
                for (int k = 0; k < 3; k++) {
                    int[] arr = transform(x, y, n);
                    matrix[x][y] = matrix[arr[0]][arr[1]];
                    x = arr[0];
                    y = arr[1];
                }
                matrix[x][y] = temp;
            }
        }
    }

    private int[] transform(int x, int y, int n) {
        // 对于(i, j)而言，逆时针旋转90度后，坐标为：[(n - 1) - j, i]
        return new int[]{(n - 1) - y, x};
    }
}

