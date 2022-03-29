    public int XXX(int m, int n) {
        int dp[]=new int[n];//m==0,赋初值
        for(int i=0;i<n;i++)
            dp[i]=1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[j]=dp[j]+dp[j-1];
            }
        }
        return dp[n-1];
    }

