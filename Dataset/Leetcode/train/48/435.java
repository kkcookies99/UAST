 class Solution {
    public void XXX(int[][] matrix) {
        XXX(matrix,0,1,matrix[0].length-1);
    }
    public void XXX(int[][] matrix,int columnStart,int rowStart,int n){
        if(n<=0) return;
        for(int i = 0;i<n;i++){
            int temp1 = matrix[rowStart-1][columnStart+i];
            
            //从上 -> 下 ↓
            int temp2 = matrix[rowStart-1+i][columnStart+n];
            matrix[rowStart-1+i][columnStart+n] = temp1;
            //从右 -> 左 ←
            int temp3 = matrix[rowStart+n-1][columnStart+n-i];
            matrix[rowStart+n-1][columnStart+n-i] = temp2;
            //从下 -> 到上 ↑
            int temp4 = matrix[rowStart+n-1-i][columnStart];
            matrix[rowStart+n-1-i][columnStart] = temp3;
            //从左 -> 右 →
            matrix[rowStart-1][columnStart+i] = temp4;
        }
        XXX(matrix,columnStart+1,rowStart+1,n-2);
    }
}

