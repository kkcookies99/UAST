 class Solution {
public:
    int XXX(vector<int>& prices) {
        if (prices.empty()) return 0;
        int ans = 0;
        int start = prices[0];
        for (int i = 1; i < prices.size(); i++) {
            if (prices[i] < start) {
                start = prices[i];
            } else {
                ans = max(ans, prices[i] - start);
            }
        }
        return ans;
    }
};

