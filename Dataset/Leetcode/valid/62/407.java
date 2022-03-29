class Solution {
    public int XXX(int m, int n) {
        int[][] answer = new int[m][n];
	for (int i = 0; i < answer.length; i++) {
		for (int j = 0; j < answer[0].length; j++) {
			if (i == 0) {
				answer[i][j] = 1;
			}else if (j == 0) {
				answer[i][j] = 1;
			} else {
				answer[i][j] = answer[i][j-1] + answer[i-1][j];
			}
		}
	}
	return answer[m-1][n-1];
    }
}

