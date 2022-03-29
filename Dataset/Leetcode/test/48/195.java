class Solution {
    public void XXX(int[][] matrix) {
        int temp1,temp2,i;
        for(int row=0,col=matrix.length-1;row<matrix.length/2;row++,col--){
            i=0;
            while(row+i<col){
                temp1=matrix[row][row+i];
                matrix[row][row+i]=matrix[col-i][row];
                temp2=matrix[row+i][col];
                matrix[row+i][col]=temp1;
                temp1=matrix[col][col-i];
                matrix[col][col-i]=temp2;
                matrix[col-i][row]=temp1;
                i++;
            }
        }
    }
}

