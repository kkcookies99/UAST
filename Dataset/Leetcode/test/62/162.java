 class Solution {
    public int XXX(int m, int n) {
        int res=0;
		int[][] arr = new int[m][n];
		arr[0][0]=1;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(i==0&&j==0) {
					continue;
				}else if(i==0) {
					arr[i][j]=arr[i][j-1];
				}else if(j==0) {
					arr[i][j]=arr[i-1][j];
				}else {
					arr[i][j]=arr[i-1][j]+arr[i][j-1];
				}
			}
		}
		return arr[m-1][n-1];
    }
}

