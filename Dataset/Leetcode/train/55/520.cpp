 class Solution {
public:
    bool XXX(vector<int>& nums) {
        vector<bool> dp;
        int len = nums.size();
        dp.resize(len);
        dp[0] = true;
        for (int i = 1; i < len; ++i) {
            dp[i] = false;
            for (int j = 0; j < i; ++j) {
                if (j + nums[j] >= i && dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len-1];
    }
};

