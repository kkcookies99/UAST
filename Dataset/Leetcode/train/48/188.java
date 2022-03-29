class Solution {
    public void XXX(int[][] matrix) {
        // 交换多少圈
        int roll = matrix.length/2;
        // 记录长度
        int n = matrix.length;
        // 存交换的临时变量
        int tmp;
        // 边界
        int borad;
        // 变换的距离
        int distance;
        for(int i=0;i<roll;i++){
            borad=n-i-1;
            // 尤其注意是从i开始的
            for(int j=i;j<borad;j++){
                distance=n-j-1;
                tmp=matrix[i][j];
                matrix[i][j]=matrix[distance][i];
                matrix[distance][i]=matrix[borad][distance];
                matrix[borad][distance]=matrix[j][borad];
                matrix[j][borad]=tmp;
            }
        }
    }
}

