 class Solution {
public:
    int XXX(vector<int>& prices) {
        if (prices.empty()) return 0;
        int ans = 0;
        int sum = 0;
        for (int i = 1; i < prices.size(); i++) {
            sum += (prices[i] - prices[i - 1]);
            ans = max(ans, sum);
            if (sum < 0) sum = 0;
        }
        return ans;
    }
};

