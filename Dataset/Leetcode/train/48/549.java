 class Solution {
    public void XXX(int[][] matrix) {
        int start = 0, end = matrix.length - 1;
        while(start < end){
            XXXOneLayer(matrix, start++, end--);
        }
    }
    //90°旋转start行和end行以及start列和end列围成的环
    public void XXXOneLayer(int[][] matrix, int start, int end){
        for(int i = start; i < end; i++){
            int tmp = matrix[start][i];
            matrix[start][i] = matrix[start + end - i][start];
            matrix[start + end - i][start] = matrix[end][start + end - i];
            matrix[end][start + end - i] = matrix[i][end];
            matrix[i][end] = tmp;
        }
    }
}

