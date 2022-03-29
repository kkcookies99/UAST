class Solution {
public:
    bool XXX(vector<int>& nums) {
        int len=nums.size();
        int dp[len];
        //dp[i]=max(dp[i-1]-1,nums[i-1]-1)
        dp[0]=0;
        //nums 2 3 1 1 4      3 2 1 0 4
        //dp   0 1 2 1 0      0 2 1 0 -1
        for(int i=1;i<len;i++)
        {
            dp[i]=max(dp[i-1]-1,nums[i-1]-1);
            if(dp[i]<0)
            {
                return false;
            }
        }
        return true;
    }
};

