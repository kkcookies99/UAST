 class Solution {
public:
    int XXX(vector<int>& prices) {
        int n = prices.size();
        if(n == 0) return 0;
        vector<int> dp(n + 5, 0);
        dp[0] = 0;
        int minn = prices[0];
        for(int i = 1; i < n; i++){
            dp[i] = max(dp[i - 1], prices[i] - minn);
            minn = min(minn, prices[i]);
        }
        return dp[n - 1];
    }
};

