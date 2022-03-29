 class Solution {
public:
    int XXX(vector<int>& nums) {
        if(nums.size()==1)return nums[0];
        vector<int>dp(nums.size()+1);
        dp[0]=nums[0];
        for(int i=1;i<nums.size();++i){
            dp[i]=max(0,max(dp[i-1],nums[i-1]))+nums[i];//纯负数情况就原封不动搬进dp数组
        }
        int maxnum=INT_MIN;
        for(int i=0;i<dp.size()-1;++i)
            maxnum=max(maxnum,dp[i]);
        return maxnum;
    }
};

