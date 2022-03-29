class Solution {
public:
    bool XXX(vector<int>& nums) {
        if(nums.size()==1) return nums[0] >= 0;
        if(nums[0]<0) return false;

        // DP[i]表示从起点0是否可以到达终点i
        // DP[i] = (DP[j]=true) && (nums[j]>=i-j) 遍历所有j<i的情形
        // 显然DP[0]=true
        // 且结果为DP[n-1], 那么从左到右更新DP数组

        vector<bool> dp(nums.size(), false);
        dp[0] = true;

        for(int i=1;i<nums.size();++i){
            for(int j=0;j<i;++j){
                if(dp[i-1] == true && (nums[j] >= i-j)){
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[nums.size()-1];
    }
};

