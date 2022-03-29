 class Solution {
public:
    int XXX(vector<int>& nums) {
        if(nums.size()==1)  return nums[0];
        vector<int>dp(nums.size(),0);
        int res=nums[0];
        dp[0]=nums[0];
        for(int i=1;i<nums.size();i++){
            dp[i]=max(dp[i-1]+nums[i],nums[i]);
            res=max(res,dp[i]);
        }
        return res;
    }
};

