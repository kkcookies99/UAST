 class Solution {
public:
    int XXX(vector<int>& nums) {
        if(nums.empty()) return 0;
        if(nums.size()==1) return nums[0];

        vector<int> dp(nums.size(), INT_MIN);
        dp[0] = nums[0];
        int res = nums[0];

        for(int i=1;i<nums.size();++i){
            dp[i] = max(nums[i], dp[i-1]+nums[i]);
            res = max(res, dp[i]);
        }

        // for(auto& n : nums)
        //     cout<<n<<" ";

        return res;
    }
};

