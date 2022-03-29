 class Solution {
public:
    // dp[i][0]:第i天持股的最大现金, 之前(含当天)只能持股或买入
    // dp[i][1]:第i天未持股的最大现金, 可能之前未持股或当天卖出
    int XXX(vector<int>& prices) {
        int n = prices.size();
        vector<vector<int>> dp(n, {0, 0});
        dp[0][0] = -prices[0];
        for(int i = 1; i < n; ++i)
            dp[i][0] = max(dp[i - 1][0], -prices[i]),
            dp[i][1] = max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
        return dp.back()[1];
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


