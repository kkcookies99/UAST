 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
    	if(numRows==0) return res;
		int[][] dp=new int[numRows][numRows];
		dp[0][0]=1;
    	for(int i=2;i<=numRows;i++){
			dp[i-1][0]=1;
    		for(int j=1;j<i;j++){
    			dp[i-1][j]=dp[i-2][j-1]+dp[i-2][j];
    		}
		}
    	for(int m=0;m<numRows;m++){
			List<Integer> list=new ArrayList<>();
    		for(int n=0;n<=m;n++){
    			list.add(dp[m][n]);
			}
			res.add(list);
		}
    	return res;

    }
}

