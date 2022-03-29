class Solution {
public:
    int XXX(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        vector<int> dp(n,0);
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<=n-1;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
};

