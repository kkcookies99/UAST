 class Solution {
public:
    int XXX(int m, int n) {
        int dp[m][n];//dp[i][j]作为终点有几种走法
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0){
                    dp[i][j]=1;
                }else if(j==0){
                    dp[i][j]=1;
                }else{
                    dp[i][j]=dp[i][j-1]+dp[i-1][j];
                }
            }
        }
        return dp[m-1][n-1];
    }
};

