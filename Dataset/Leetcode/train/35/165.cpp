 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        return lower_bound(nums.begin(),nums.end(),target) - nums.begin();
    }
};

