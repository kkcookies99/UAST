 class Solution {
public:
    int XXX(vector<int>& prices) {

        int ans = 0, mn = prices[0];

        //那当然是最大出最少入的时候
        //即：维护一个最大值，一个最小值即可
        for (int j = 1; j < prices.size(); ++j) {
            //维护最大值
            ans = max(ans, prices[j] - mn);
            // 维护最小值
            mn = min(mn, prices[j]);
        }
        return ans;
    }
};

