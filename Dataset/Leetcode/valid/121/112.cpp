 class Solution {
public:
    int XXX(vector<int>& prices) {
        int delta = 0;
        int lower = 0;
        int profit = 0;
        for (int i = 1; i < prices.size(); ++i) {
            delta += prices[i] - prices[i - 1];
            profit = max(delta, profit);
            if (delta < 0) {
                lower = i;
                delta = 0;
            }
        }
        return profit;
    }
};

