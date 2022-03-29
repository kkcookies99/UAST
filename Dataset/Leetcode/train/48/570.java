 class Solution {
    public void XXX(int[][] matrix) {
        int x = 0;
        int y = 0;
        int z = matrix.length - 1;
        int w = matrix[0].length - 1;

        // 从外往里缩, 通过x 与 z 数量关系判断是否到了最里层
        while(x < z){
            // 每一层的处理可以封装成一个方法
            helper(matrix, x++, y++, z--, w--);
        }
    }

    // 交换位置时是四个元素一组, 这层需要教官多少组由这一层的边长决定.
    private void helper(int[][] matrix, int x, int y, int z, int w){
        for(int i = 0; i < z - x; i++){
            int temp = matrix[x][y + i];
            matrix[x][y + i] = matrix[z - i][y];
            matrix[z - i][y] = matrix[z][w - i];
            matrix[z][w - i] = matrix[x + i][w];
            matrix[x + i][w] = temp;
        }
    }
}

