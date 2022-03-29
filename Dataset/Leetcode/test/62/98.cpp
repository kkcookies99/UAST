 class Solution {
public:
    int XXX(int m, int n) {
        vector<vector<int>>dp(n,(vector<int>(m,1)));
        //dp[i][j]表示到i,j位置有多少条路径
        //dp[i][j]=dp[i-1][j]+dp[i][j-1]  
        if(m==1||n==1) return 1;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[n-1][m-1];
        
    }
};

