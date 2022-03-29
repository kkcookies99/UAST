 class Solution {
public:
    int XXX(vector<int>& prices) {
        int n = prices.size();
        //数组下标表示在第i天前所能获得的最大利润
        vector<int>dp(n);
        int minprice = prices[0];//记录当前下标之前的最小进价
        for(int i = 1;i<n;++i)
        {
            //递推公式 
            //第i天获得迪润最大值为（前一天利润最大值和今天卖出获得利润）的最大值
            //即dp[i] = max(dp[i-1],prices[i]-minprice);
            dp[i] = max(dp[i-1],prices[i]-minprice);
            minprice = min(minprice,prices[i]);
        }
        return dp[n-1];
    }
};

