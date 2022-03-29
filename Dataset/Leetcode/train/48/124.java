class Solution {
    public void XXX(int[][] matrix) {
        if(matrix.length>1) {
        	int i=0,j=matrix.length-1;
        	while(i<j) {
        		int k=j-i;//循环次数
        		int l=0;
        		//在当前矩阵圈中 由四角互换开始   进而通过循环顺时针将四边逐步互换
        		while(l<k) {
        			int temp=matrix[i][i+l];//
        			matrix[i][i+l]=matrix[j-l][i];
        			matrix[j-l][i]=matrix[j][j-l];
        			matrix[j][j-l]=matrix[i+l][j];
        			matrix[i+l][j]=temp;
        			l++;//进入下一次循环
        		}
        		i++;j--;//进入矩阵下一圈
        	}
        }
    }	
}

