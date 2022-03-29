class Solution {
public:
    bool XXX(vector<int>& nums) {
        vector<int> dp(nums.size(),0);
        //dp[i] 截止到i位置  能跳跃到达最远的位置
        dp[0]=nums[0];
        for(int i=1;i<nums.size();i++){
            if(dp[i-1]>=i){
                dp[i]=max(dp[i-1],i+nums[i]);
            }
            else{
                dp[i]=dp[i-1];
            }
            
        }
        return dp[nums.size()-1]>=nums.size()-1;
    }
};

