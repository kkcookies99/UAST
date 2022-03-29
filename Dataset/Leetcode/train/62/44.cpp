 class Solution {
public:
    // int XXX(int m, int n) {
    //     if(m==1||n==1)return 1;
    //     return XXX(m-1,n)+XXX(m,n-1);
    // }
    int XXX(int m, int n) {
        int dp[100][100]={0};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0)dp[i][j]=1;
                else dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
};

