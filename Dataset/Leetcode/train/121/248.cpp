 class Solution {
public:
    int XXX(vector<int>& prices) {

        int ans = 0, mn = prices[0];
        for (int j = 1; j < prices.size(); ++j) {
            ans = max(ans, prices[j] - mn);
            // 边遍历边维护
            mn = min(mn, prices[j]);
        }
        return ans;
    }
};

