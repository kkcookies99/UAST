 class Solution {
public:
    bool XXX(vector<int> &nums) {
        int n = nums.size();
        vector<bool> dp(n, false);
        dp[0] = true;
        for (int i = 1; i < n; ++i) {
            for (int j = 1; j <= i; ++j) {
                if (dp[i - j] && nums[i - j] >= j) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n - 1];
    }
};

