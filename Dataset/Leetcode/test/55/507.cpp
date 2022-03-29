 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int len=nums.size();
        if(len==1) return true;
        vector<int> dp(len);//dp[i]表示结点i最远可以到结点几
        dp[0] = nums[0];//base case 
        for(int i=1;i<len;i++){
            if(dp[i-1]<i||(dp[i-1]==i&&nums[i]==0&&i!=len-1))
                return false;
            dp[i]=max(dp[i-1],nums[i]+i);
        }
        return dp[len-1]>=len-1?true:false;
    }
};

