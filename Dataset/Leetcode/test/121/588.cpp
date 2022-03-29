 class Solution {
public:
    int XXX(vector<int>& prices) {
        int MinPrice = prices[0];
        int MaxProfit = 0;
        for (int i = 0; i < prices.size(); ++i) {
            MaxProfit = max(MaxProfit, prices[i] - MinPrice);
            MinPrice = min(MinPrice, prices[i]);
        }
        return MaxProfit;
    }
};

