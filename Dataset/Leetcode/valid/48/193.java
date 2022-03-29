class Solution {
    public void XXX(int[][] matrix) {
        int size = matrix.length;
        //外圈到内圈的遍历，每一圈是框框
        for(int i=0;i<size/2;i++){
            int len = size-2*i;
            //框框的第一部分上找到点，在其他三部分上都有对应的点
            for(int d=0;d<len-1;d++){
                //四个坐标[i,i+d],[i+d,i+len-1],[i+len-1,i+len-1-d],[i+len-1-d,i]
                int tmp = matrix[i][i+d];
                matrix[i][i+d]=matrix[i+len-1-d][i];
                matrix[i+len-1-d][i]=matrix[i+len-1][i+len-1-d];
                matrix[i+len-1][i+len-1-d]=matrix[i+d][i+len-1];
                matrix[i+d][i+len-1]=tmp;                
            }
        }
        return;        
    }
    
}

