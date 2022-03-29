class Solution {
    public void XXX(int[][] matrix) {
        //顺时针缩小
        int[][] des = {{1,1},{1,-1},{-1,-1},{-1,1}};
        //顺时针四个角的坐标。旋转时，只循环 matrix.length - 1 次。
        int[][] top = {{0,0},{0,matrix.length - 1},{matrix.length - 1, matrix.length - 1},{matrix.length - 1,0}};
        //从外向内缩小。结束条件左上顶点大于等于右下顶点就结束，因为这两个顶点各自的行列都是相等的
        while (top[0][0] < top[2][0]) {
            for (int i = top[0][1],j = top[1][0]; i < top[1][1]; i++,j++) {
                matrix[top[0][0]][i] ^= matrix[j][top[1][1]];
                matrix[j][top[1][1]] ^= matrix[top[0][0]][i];
                matrix[top[0][0]][i] ^= matrix[j][top[1][1]];
            }
            for (int i = top[0][1],j = top[2][1]; i < top[1][1]; i++,j--) {
                matrix[top[0][0]][i] ^= matrix[top[2][0]][j];
                matrix[top[2][0]][j] ^= matrix[top[0][0]][i];
                matrix[top[0][0]][i] ^= matrix[top[2][0]][j];
            }
            for (int i = top[0][1],j = top[3][0]; i < top[1][1];i++,j--) {
                matrix[top[0][0]][i] ^= matrix[j][top[3][1]];
                matrix[j][top[3][1]] ^= matrix[top[0][0]][i];
                matrix[top[0][0]][i] ^= matrix[j][top[3][1]];
            }
            //缩小
            for (int i = 0; i  < 4; i++) {
                top[i][0] += des[i][0];
                top[i][1] += des[i][1];
            }
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


