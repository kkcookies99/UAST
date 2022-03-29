 class Solution {
public:
    int XXX(vector<int>& nums) {

            auto iter = unique(nums.begin(), nums.end());
            nums.erase(iter, nums.end());
            return nums.size();

    }
};

