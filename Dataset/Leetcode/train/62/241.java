 class Solution {
    public int XXX(int m, int n) {
        //dp[m][n] = dp[m-1][n] + dp[m][n-1]
        int[][] dp = new int[m][n];

        //把所有第0列的值变成1， 因为都只能通过一直向下得到
        for(int i = 0 ; i < m ; i++){
            dp[i][0] = 1;
        }

        //把所有第0排的值变成1，因为只能一直向右得到
        for(int i = 0 ; i < n; i++){
            dp[0][i] = 1;
        }
        
        //从第二排第二列（下标为dp[1][1]）开始计算
        //状态转移方程：dp[m][n] = dp[m-1][n] + dp[m][n-1]
        for(int i = 1 ; i < m ; i++){
            for(int j = 1 ; j < n ; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
                System.out.println("dp["+i+"]["+j+"] = " + dp[i][j]);
            }
        }

        return dp[m-1][n-1];
    }
}

