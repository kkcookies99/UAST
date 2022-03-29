 class Solution {
public:
    int XXX(vector<int>& prices) {
        int min_price = prices[0], max_profit = 0;
        for (const auto &price : prices) {
            min_price  = min(min_price, price);
            max_profit = max(price - min_price, max_profit);
        }
        return max_profit;
    }
};

