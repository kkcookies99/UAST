 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int[][] dp = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
        }
        for (int i = 2; i <numRows ; i++) {
            for (int j = 1; j <numRows-1 ; j++) {
                dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
            }
        }
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                temp.add(dp[i][j]);
            }           
            res.add(temp);
        }    
        return res;
    }
}

