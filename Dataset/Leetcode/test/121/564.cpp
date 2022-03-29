 class Solution {
public:
    int XXX(vector<int>& prices) {
        int n=prices.size();
        vector<int > dp(n);
        dp[0]=0;
        int min=prices[0];
        for(int i=1;i<n;i++)
        {
            if(prices[i]<min)
                min=prices[i];
            dp[i]=max(dp[i-1],prices[i]-min);
        }
        return dp[n-1];
    }
};
