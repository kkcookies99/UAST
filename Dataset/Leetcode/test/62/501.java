class Solution {
    public int XXX(int m, int n) {
        //因为到达右下角[m-1,n-1]的只有[m-2,n-1]和[m-1,n-2] 所以状态方程为
        // dp[i][j] = dp[i-1][j]+dp[i][j-1] 
        int [][] dp = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i==0 || j==0){   // 第一行和第一列都只有一种
                dp[i][j] = 1;
                }else
                {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];     
    }
}

