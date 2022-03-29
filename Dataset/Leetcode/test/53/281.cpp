class Solution {
public:
    int XXX(vector<int>& nums) {
        if(nums.empty()) return 0;
        if(nums.size()<2) return nums.back();
        vector<int> dp(nums.size(), 0);
        int maxSum = INT_MIN;
        for(int i=0; i<nums.size(); ++i){
            if(i==0)
                dp[i] = nums[i];
            else
                dp[i] = max(dp[i-1]+nums[i], nums[i]);
            if(dp[i] > maxSum){
                maxSum = dp[i];
            }
        }
        return maxSum;
    }
};

