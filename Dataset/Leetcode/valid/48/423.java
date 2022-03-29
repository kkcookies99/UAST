 class Solution {
    public void XXX(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix.length - 1;
        while (left < right && top < bottom) {
            int[] res = new int[bottom];
            //上到右
            for (int i = left; i < right; i++) {
                res[i] = matrix[i][right];
                matrix[i][right] = matrix[top][i];
            }
            //右到下
            for (int i = top; i < bottom; i++) {
                int temp = res[i];
                res[i] = matrix[bottom][bottom + top - i];
                matrix[bottom][bottom + top - i] = temp;
            }
            //下到左
            for (int i = right; i > left; i--) {
                int temp = res[right + left - i];
                res[right + left - i] = matrix[i][left];
                matrix[i][left] = temp;
            }
            //左到上
            for (int i = bottom; i > top; i--) {
                matrix[top][bottom + top - i] = res[bottom + top - i];
            }
            left++;
            right--;
            top++;
            bottom--;
        }
    }
}

