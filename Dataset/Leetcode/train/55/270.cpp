class Solution {
public:
    bool XXX(vector<int>& nums) {
        if(nums.size() <= 1) return true;
        int res = 0;
        int n = nums.size();
        for(int i = 0; i < n-1; ++i) {
            res = max(res-1, nums[i]);
            if(res <= 0) return false;
        }
        return true;
    }
};

