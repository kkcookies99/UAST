 class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(matrix, i, j, j, i);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                swap(matrix, i, j, i, n - 1 - j);
            }
        }
    }

    public void swap(int[][] nums, int x1, int y1, int x2, int y2) {
        int temp = nums[x1][y1];
        nums[x1][y1] = nums[x2][y2];
        nums[x2][y2] = temp;
    }
}

