 class Solution {
public:
    int XXX(int m, int n) {
        //空间复杂度 o(n2);
        vector<vector<int>> dp(m,vector<int>(n,1));
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
        

        //为降低空间复杂度，使用滚动数组
        vector<int> dp(n+1,1);
        dp[0]=0;
        while(m>1){
            for(int i=1;i<=n;i++){
                dp[i]=dp[i-1]+dp[i];
            }
            m--;
        }
        return dp[n];
    }
};

