 class Solution {
public:
    int XXX(vector<int>& prices) {
        //动态规划 
        if (prices.size() <= 1 ) return 0;
        vector<int> dp(prices.size(),0);//dp[i] 表示前i天的最大利润
        dp[0] = 0;//初始化
        int low = prices[0];

        for (int i= 1;i<prices.size();i++){
            dp[i] = max(dp[i-1],prices[i]-low);
            low = min(prices[i],low);
        }
        
        return dp[prices.size()-1];
    }
};

