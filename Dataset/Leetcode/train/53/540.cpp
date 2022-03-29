 class Solution {
public:
    int XXX(vector<int>& nums) {
        int dp = nums[0];
        int maxx = nums[0];
        for(int i = 1; i < nums.size(); i++)
        {
            dp = max(dp + nums[i], nums[i]);
            if(dp > maxx)
                maxx = dp;
        }
        return maxx;
    }
};

