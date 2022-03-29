 class Solution {
public:
    // 1.dp[i]:以i结尾的数组中的最大和
    // 2.dp[i] = dp[i - 1] < 0 ? nums[i] : dp[i - 1] + nums[i]
    // 3.初始化:dp[0] = nums[0]
    int XXX(vector<int>& nums) {
        int res, n = nums.size();
        vector<int> dp(n, 0);
        dp[0] = nums[0], res = dp[0];
        for(int i = 1; i < n; ++i) {
            dp[i] = dp[i - 1] < 0 ? nums[i] : dp[i - 1] + nums[i];
            res = max(res, dp[i]);
        }
        return res;
    }
};

