class Solution {
public:
    int XXX(vector<int>& nums) {
        int n = nums.size();
        int dp[n];
        fill(dp, dp + n, 0);
        int res = nums[0];
        dp[0] = nums[0];
        for (int i = 1; i < n; ++i) {
            dp[i] = max(dp[i - 1] + nums[i], nums[i]);
            res = max(dp[i], res);
        }
        return res;
    }
};

