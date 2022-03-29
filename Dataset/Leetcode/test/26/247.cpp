 class Solution {
public:
    int XXX(vector<int>& nums) {
        auto end_iter = unique(nums.begin(), nums.end());
        return end_iter - nums.begin();
    }
};

