 class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;//待会做排除
		List list  = new ArrayList();
		if(n>=1&&n<=20) {
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					list.add(matrix[n-j-1][i]);
				}
			}
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					matrix[i][j] = (int) list.get(i*n+j);
				}
			}
        }
    }
}

