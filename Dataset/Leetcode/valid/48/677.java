 class Solution {
    public void XXX(int[][] matrix) {
        // 先上下翻转，再转置
		// 上下翻转
		int n = matrix.length;
		for(int i = 0; i < n/2; i++) {
			for(int j = 0; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n - 1 - i][j];
				matrix[n - 1 - i][j] = temp;
			}
		}
		
		// 转置
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
    }
}

