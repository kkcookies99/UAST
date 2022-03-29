 class Solution {
    public void XXX(int[][] matrix) {
        if(matrix.length==1) return ;
        int len = matrix.length;
        //将数组倒置
        for(int i=0;i<len/2;i++){
            for(int j=0;j<len;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len-1-i][j];
                matrix[len-1-i][j] = temp;
            }
        }
        //将数组沿着对角线对折
        for(int i=0;i<len;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return ;


    }
}

