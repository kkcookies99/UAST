class Solution {
    public void XXX(int[][] matrix) {
        int top = 0, down = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while(top < down && left < right) {
            swap(matrix, top, left, top, right);
            swap(matrix, top, left, down, right);
            swap(matrix, top, left, down, left);

            // top -> right
            for(int k = left + 1; k <= right - 1; k++) {
                swap(matrix, top, k, k, right);
            }
            // right -> down
            for(int k = left + 1; k <= right - 1; k++) {
                swap(matrix, top, k, down, right - k + left);
            }
            // down -> left && left -> top
            for(int k = left + 1; k <= right - 1; k++) {
                swap(matrix, top, k, down - k + left, left);
            }

            top++;
            down--;
            left++;
            right--;
        }
    }

    public void swap(int[][] matrix, int i, int j, int m, int n) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[m][n];
        matrix[m][n] = tmp;
    }

}

