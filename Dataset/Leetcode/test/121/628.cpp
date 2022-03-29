 class Solution {
public:
    int XXX(vector<int>& prices) {
        int priceInit = prices[0];
        int maxVal = 0;
        for (int i = 1; i < prices.size(); i++) {
            maxVal = max(maxVal, prices[i] - priceInit);
            priceInit = min(priceInit, prices[i]);
        }
        return maxVal;
    }
};

