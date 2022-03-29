class Solution {
public:
    bool XXX(vector<int>& nums) {
        int len = nums.size();
        vector<int> dp(len, 0);
        dp[0] = 1;
        for(int i = 0; i < len; i++)
        {
            if(dp[i] == 1)
            {
                int end = nums[i] + i < len - 1 ? nums[i] + i : len - 1;
                for(int j = i + 1; j <= end; j++)
                {
                    dp[j] = 1;
                }
            }
        }
        return dp[len - 1] == 1;
    }
};

