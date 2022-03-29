 class Solution {
public:
	int XXX(vector<int>& prices) {
		int max_profit = 0;
		if (prices.size() <= 1) return 0;
		//int min = prices[0];
		//int max = prices[1];
		for (int i = 0; i < prices.size()-1; i++) {
			if (prices[0] > prices[i]) {
				prices[0] = prices[i];
				prices[1] = prices[i];
			}
			if (prices[i + 1] > prices[1]) {
				prices[1] = prices[i + 1];
			}
			if (prices[1] > prices[0] && prices[1] - prices[0] > max_profit) {
				max_profit = prices[1] - prices[0];
			}
		}
		return max_profit;
	}
};

