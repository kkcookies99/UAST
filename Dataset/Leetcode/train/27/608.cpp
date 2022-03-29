 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        auto it = std::remove_if(nums.begin(), nums.end(), [=](const int &x) {return x == val;});
        nums.erase(it, nums.cend());
        return nums.size();
    }
};

