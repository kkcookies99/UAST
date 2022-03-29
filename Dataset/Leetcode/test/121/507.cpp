 class Solution {
public:
    int XXX(std::vector<int>& prices) {
        std::vector<int> profit(prices.size(), 0);
        int max = 0;
        for (int i = 1; i < prices.size(); i++) {
            int temp = std::max(prices[i] - prices[i - 1], profit[i - 1] + prices[i] - prices[i - 1]);
            if (temp > 0)
                profit[i] = temp;
            if (temp > max)
                max = temp;
        }
        return max;
    }
};

