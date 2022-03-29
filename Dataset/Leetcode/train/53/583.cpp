 class Solution {
public:
    int XXX(vector<int>& nums) {
        int dp[nums.size()+1];
        memset(dp,0,sizeof(dp));
        int max=INT_MIN;
        
        for(int i=0;i<nums.size();i++){
            dp[i+1]=dp[i]<0?nums[i]:dp[i]+nums[i];
            max=dp[i+1]>max?dp[i+1]:max;
        }
        return max;
    }
};

