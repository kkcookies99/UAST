 class Solution {
    public void XXX(int[][] matrix) {
        int num1=matrix.length/2;
		int num2=matrix.length;
		for(int i=0;i<num1;i++,num2--){
			for(int j=i;j<num2-1;j++){
				int n=matrix.length-i-1;
				int a1=matrix[i][j];
				int a2=matrix[j][n];
				int a3=matrix[n][n-j+i];
				int a4=matrix[n-j+i][i];
				matrix[i][j]=a4;
				matrix[j][n]=a1;
				matrix[n][n-j+i]=a2;
				matrix[n-j+i][i]=a3;
			}
		}
    }
}

