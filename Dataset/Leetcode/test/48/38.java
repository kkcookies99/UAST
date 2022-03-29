class Solution {
    public void XXX(int[][] matrix) {
        XXX(matrix, 0, matrix.length - 1);
    }

    public void XXX(int[][] matrix, int start, int end){
        if(end <= start) return;
        int n = end - start;//每一条边的长度
        int top = start, right = end,  bottom = end, left = start;

        for(int i = 0; i < n; i++){
            int tmp = matrix[top][start + i];
            //左上角
            matrix[top][start + i] = matrix[end - i][left];
            //左下角
            matrix[end - i][left] = matrix[bottom][end - i];
            //右下角
            matrix[bottom][end - i] = matrix[start + i][right];
            //右上角
            matrix[start + i][right] = tmp;
        }

        XXX(matrix, start + 1, end - 1);
    }
}

