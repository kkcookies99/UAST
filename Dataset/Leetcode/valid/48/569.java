 class Solution {
    public void XXX(int[][] matrix) {

        if(matrix.length == 0){
            return;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        //上下反转
        int i=0, j = row-1;
        while(i < j){
            for(int k=0;k<col;k++){
                int t = matrix[i][k];
                matrix[i][k] = matrix[j][k];
                matrix[j][k] = t;
            }
            i++;
            j--;
        }

        //沿对角线反转
        for(i=0;i<row;i++){
            for(j=i+1;j<col;j++){
                int t = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = t;
            }
        }
    }
}

