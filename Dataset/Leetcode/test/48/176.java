class Solution {
    public void XXX(int[][] matrix) {
        //上下交换
        int end = matrix.length - 1;
        for(int left=0;left<matrix.length/2;left++){
            int[] temp = matrix[left];
            matrix[left] = matrix[end];
            matrix[end] = temp;
            end = end - 1;
        }
        //对角线交换
        for(int j=1;j<matrix.length;j++){
            for(int k=0;k<j;k++){
                int temp = matrix[j][k];
                matrix[j][k] = matrix[k][j];
                matrix[k][j] = temp;
            }
        }
    }
}

