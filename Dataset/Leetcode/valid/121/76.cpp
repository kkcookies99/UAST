 class Solution {
public:
    int XXX(vector<int>& prices) {
        int profit = 0, buy_price = prices[0];
        for(int i = 1 ; i < prices.size(); ++i)
        {
            if(prices[i] <= prices[i - 1]) 
            {
                buy_price = min(buy_price, prices[i]);
                continue;
            }
            profit = max(profit, prices[i] - buy_price);
        }
        return profit;
    }
};

