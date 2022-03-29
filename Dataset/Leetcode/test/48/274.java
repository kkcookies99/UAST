class Solution {
    public void XXX(int[][] matrix) {
        for(int t=0;t<matrix.length/2;t++){
            int left=t;
            int right=matrix[0].length-t;
            int low=t;
            int hight=matrix.length-t;
            //旋转90度，就是移动n-1次
            for(int i=low;i<right-1;i++){
                int temp1=matrix[low][left];
                int temp2=matrix[low][right-1];
                //四个for循环，分别代表四条边，顶边
                for(int p=right-1;p>left+1;p--){
                    matrix[low][p]=matrix[low][p-1];
                }
                matrix[low][left+1]=temp1;
                //右侧边
                temp1=temp2;
                temp2=matrix[hight-1][right-1];
                for(int j=hight-1;j>low+1;j--){
                    matrix[j][right-1]=matrix[j-1][right-1];
                }
                matrix[low+1][right-1]=temp1;
                //底边
                temp1=temp2;
                temp2=matrix[hight-1][left];
                for(int m=left;m<right-2;m++){
                    matrix[hight-1][m]=matrix[hight-1][m+1];
                }
                matrix[hight-1][right-2]=temp1;
                //左侧边
                temp1=temp2;
                for(int k=low;k<hight-2;k++){
                    matrix[k][left]=matrix[k+1][left];
                }
                matrix[hight-2][left]=temp1;
            }             
        }
    }
}

