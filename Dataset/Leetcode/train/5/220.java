 class Solution {
   public String XXX(String s) {
		int len = s.length();
		boolean [][] dp = new boolean[len][len];
		String res = s.substring(0,1);
		//dp[i][j]代表 s.substring(i,j+1)是不是回文串
		for(int i = 0;i<len;i++) {
			dp[i][i] = true;
			char c = s.charAt(i);
			for(int j = 0;j<i;j++) {
				if(s.charAt(j) == c) {
					if(i-j == 1) {
						dp[j][i] = true;
					}else {
						dp[j][i] = dp[j+1][i-1];
					}
				}
				if(dp[j][i]) {
					res = res.length() < i-j+1?s.substring(j,i+1):res;
				}
			}
			
		}
		return res;

    }
}

