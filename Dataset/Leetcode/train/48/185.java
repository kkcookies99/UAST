    public void XXX(int[][] matrix) {
        int n=matrix.length;//原始数组的列数
		int[][] result=new int[n][n];
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j]=matrix[n-1-j][i];
			}
		}
        //将值赋给原数组
        for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				matrix[i][j]=result[i][j];
			}
		}
    }

