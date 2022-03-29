class Solution {
public:
    int XXX(vector<int>& nums){
        int n = nums.size();
        vector<int> dp(n);
        dp[0] = nums[0];
        int maxsum = dp[0];
        for(int i = 1; i < n; i++){
            dp[i] = max(dp[i-1]+nums[i], nums[i]);  //获取以i结尾的连续最大子列和;
            maxsum = max(dp[i],maxsum);
        }
        return maxsum;
    }
};

