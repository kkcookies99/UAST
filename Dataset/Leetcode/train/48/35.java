 public void XXX(int[][] matrix) {
	//把原始数组放到一个一维数组中
	int len = matrix.length;
	int[] read = new int[len * len];
	for (int i = 0; i < len; i++) {
		for (int j = 0; j < len; j++) {
			read[i * len + j] = matrix[i][j];
		}
	}
	// 开始旋转
	for (int i = 0; i < read.length; i++) {
		matrix[i%len][len-1-i/len]=read[i];
	}
    }

