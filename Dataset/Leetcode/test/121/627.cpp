 class Solution {
public:
    int XXX(vector<int>& prices) {
        vector<int>dp(prices.size(),0);
        int minday = prices[0];
        for(int i=1;i<prices.size();i++){
            dp[i] = max(dp[i-1],prices[i]-minday);
            minday = min(prices[i],minday);
        }
        return dp[prices.size()-1];
    }
};

