 class Solution {
public:
    int XXX(vector<int>& nums) {
        vector<int>dp(nums.size(),nums[0]);
        int max=nums[0];
        for(int i=1;i<nums.size();++i){
            dp[i]=dp[i-1]>0?nums[i]+dp[i-1]:nums[i];
            max=::max(max,dp[i]);
        }return max;
    }
};

