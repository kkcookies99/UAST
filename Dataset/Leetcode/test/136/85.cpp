 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int n = 0;
        for (auto & val : nums) n ^= val;
        return n;
    }
};

