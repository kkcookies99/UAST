 class Solution {
public:
    bool XXX(vector<int>& nums) {
     vector<int> dp(nums.size()+1,0);
     dp[0]=0;
     if(nums.size()==1){
         return true;
     }
     for(int i=0;i<nums.size();i++){
         if(i==nums.size()-1){//到末尾后，只与前面一个状态有关
             dp[i+1]=dp[i]-1;
             break;
         }
        dp[i+1]=max(dp[i]-1,nums[i]);//下一状态与前一状态和当前状态有关
        if(dp[i+1]<=0){
             return false;//下一状态小于0 ，不能进行跳跃
         }
     }
     return dp[nums.size()]>=0?true:false;
    }
};

