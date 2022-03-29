 class Solution {
public:
    bool XXX(vector<int>& nums) {
        if(nums.size()<=1){return true;}
        vector<int>dp(nums.size(),0);dp[0]=1;int size=nums.size();
        for(int i=0;i<size;i++)
        {
            if(dp[i]==1)
            {
                if(i+nums[i]>=size-1){return true;}
                else
                {
                    int temp=nums[i];
                    while(temp>=0&&dp[i+temp]==0){dp[i+temp]=1;temp--;}
                }  
            }
            else{return false;}
        }
        return dp[size-1]==1;
    }
};

