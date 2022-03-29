 class Solution {
public:
    int XXX(vector<int>& prices) {
        int size = prices.size();
        int dp = 0;
        int res = 0;
        for(int i = 1; i < size; i++) {
            dp = max(dp, 0) + (prices[i] - prices[i-1]);
            res = max(res, dp);
        }
        return res;

    }
};

