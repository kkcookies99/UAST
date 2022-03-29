 class Solution {
public:
    int XXX(vector<int>& prices) {
        int s = prices.size();
        int dp[s][2];
        memset(dp, 0, 2*s*sizeof(int));
        dp[0][1] = -prices[0];
        for(int i=1; i<s; i++)
        {
            dp[i][0] = max(dp[i-1][0], dp[i-1][1]+prices[i]);
            dp[i][1] = max(dp[i-1][1], -prices[i]);
        }
        return dp[s-1][0];
    }
};```

