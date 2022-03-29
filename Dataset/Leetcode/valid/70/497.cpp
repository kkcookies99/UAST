class Solution {
public:
    int XXX(int n) {
        if(n<4)
        {
            if(n==0||n==1)return 1;
            else if(n==2)return 2;
            else return 3;
        }
        vector<int> dp(n+1,0);
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for(int i=4;i<n+1;i++)
        {
            dp[i] = dp[i-1] + dp[i-2]; 
        }
        return dp[n];
    }
};

