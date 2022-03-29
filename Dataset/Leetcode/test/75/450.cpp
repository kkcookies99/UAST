 class Solution {
public:
    void XXX(vector<int>& nums) {
        std::ios::sync_with_stdio(false);
        vector<int>::iterator bound = partition(nums.begin(), nums.end(), [](int i) { return i == 0; });
        partition(bound, nums.end(), [](int i) { return i == 1; });
    }
};

