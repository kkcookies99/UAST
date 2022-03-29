class Solution {
    public int XXX(int m, int n) {
       //动态规划？？
       //学到了，动态规划基本思想
       //dp[i][j]表示走到（i,j）这个点有多少条路径
       //dp[m-1][n-1]即为答案
       //到dp[i][j]只有从dp[i-1][j]或者dp[i][j-1]过来两条路径
       //所以到dp[i][j]的所有路径是dp[i-1][j]+dp[i][j-1]
       //注意边界，i=0和j=0时，初始化为1
       int[][] dp = new int[m][n];
       for(int i =0;i<m;i++){
           for(int j=0;j<n;j++){
               if(i==0||j==0){
                   dp[i][j] =1; //初始点为1
               }else{
                   dp[i][j] = dp[i-1][j] + dp[i][j - 1];
               }
           }
       }
       return dp[m-1][n-1];
    
    }
}

