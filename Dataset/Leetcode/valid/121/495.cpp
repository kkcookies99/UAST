 class Solution {
public:
    int XXX(vector<int>& prices) {
        int result = 0, min_price = prices[0];
        for (int i = 1; i < prices.size(); ++i) {
            result = max(result, prices[i] - min_price);
            min_price = min(prices[i], min_price);
        }
        return result;
    }
};

