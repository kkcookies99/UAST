class Solution {
    public void XXX(int[][] matrix) {
        // 递归
        xz(matrix,0);
    }

    private void xz(int[][] matrix,int n){
        if(n >= matrix.length/2 ) return;
         // 递归
        xz(matrix,n+1);
        // 回溯
        int edge = matrix.length-1-n;
        for(int i = 0; i < edge-n; i++){
            // 临时变量，上
            int arrn = matrix[n][i+n];
            // 左赋值到上 > 下赋值到左 > 右赋值到下 > 上赋值到右
            matrix[n][i+n] = matrix[edge-i][n];
            matrix[edge-i][n] = matrix[edge][edge-i];
            matrix[edge][edge-i] = matrix[n+i][edge];
            matrix[n+i][edge] = arrn;
        }
    }
}

