class Solution {
public:
    int XXX(vector<int>& nums) {
        int n = nums.size();
        vector<int> dp(n,0);
        dp[0] = nums[0];
        int ans = dp[0];
        for (int i = 1; i < n; i++){
            dp[i] = max(nums[i], dp[i-1] + nums[i]);
            ans = max(ans, dp[i]);
        }
        return ans;
    }
};

