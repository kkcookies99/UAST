 class Solution {
public:
    int XXX(vector<int>& prices) {
        int n = prices.size();
        if(n==1) return 0;
        vector<int> dp(n+1);
        dp[1] = (prices[1]-prices[0])>0?(prices[1]-prices[0]):0;
        int max_price = dp[1];
        for(int i=2;i<n;i++){
            dp[i] = max(dp[i-1] + prices[i]-prices[i-1],0);
            max_price = max(max_price,dp[i]);
        }
        return max_price;
    }

};

