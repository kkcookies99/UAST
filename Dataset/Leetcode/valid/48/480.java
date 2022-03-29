 class Solution {
    public void XXX(int[][] matrix) {
        //逐层处理（模拟）
        int n = matrix.length , layer = n / 2;
        for(int i = 0; i < layer ; i++){
            //每一层内部的模拟
            for(int j = i ;j < n - i - 1; j++){
                int x = i, y = j;
                int tmp = matrix[x][y];
                for(int k = 0; k < 4; k++){
                    int tmp2 = matrix[y][n - x - 1];
                    matrix[y][n - x - 1] = tmp;
                    tmp = tmp2;
                    int temp = x;
                    x = y;
                    y = n - temp - 1;
                }
            }
        }
    }
}

