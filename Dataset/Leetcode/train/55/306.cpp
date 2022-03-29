class Solution {
public:
    bool XXX(vector<int>& nums) {
        int stepleft = nums[0];
        for(int i = 1; i < nums.size(); i++)
        {
            if(stepleft == 0) return false;
            stepleft = max(stepleft - 1, nums[i]);
        }
        return true;
    }
};

