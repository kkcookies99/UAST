class Solution {
public:
//计算n个里面选m个的组合数
int  countCombination(int n,int m){
    if(m==0||m==n) return 1;
    vector<vector<int> > dp(n+1,vector<int>(m+1,0));
    for(int i=0;i<=n;++i)
        dp[i][0]=1;  //m==0时为1
        
    for(int i=1;i<=n;++i){
        for(int j=1;j<=m;++j){
            if(i==j) dp[i][j]=1;
            else
                dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
        }
    }
    return dp[n][m];
}
    int XXX(int m, int n) {
        return countCombination(m+n-2,m-1);  
    }
};

