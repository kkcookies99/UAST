 class Solution {
public:
    //方法一：动态规划 居然超时了，可恶的*min_element()
    int dynamicMaxPro(vector<int> prices)
    {
        vector<int> dp(prices.size(), 0);
        for(int i = 1; i < prices.size(); i++)
            dp[i] = max(dp[i - 1], prices[i] - *min_element(prices.begin(), prices.begin() + i));
        return dp[prices.size() - 1];
    }
    //方法二：找规律，维护最低价格变量，每次用最低价格与后面的价格差来维护最大利润
    int regularMaxPro(vector<int> prices)
    {
        int maxpro = 0;
        int minprice = INT_MAX;
        for(int i = 0; i < prices.size(); i++)
        {
            minprice = min(prices[i], minprice);
            maxpro = max(maxpro, prices[i] - minprice);
        }
        return maxpro;
    }
    int XXX(vector<int>& prices) {
        // return dynamicMaxPro(prices);
        return regularMaxPro(prices);
    }
};

