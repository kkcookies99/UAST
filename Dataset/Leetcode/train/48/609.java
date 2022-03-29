 class Solution {
    public void XXX(int[][] matrix) {
        int start = 0, end = matrix.length - 1;
        while(start < end) {
            for(int i = 0; i < end - start; i++) {
                int t = matrix[start][start + i];
                matrix[start][start + i] = matrix[end - i][start];
                matrix[end - i][start] = matrix[end][end - i];
                matrix[end][end - i] = matrix[start + i][end];
                matrix[start + i][end] = t;
            }
            start++;
            end--;
        }
    }
}

