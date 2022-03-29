 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int n = 0;
        for (auto c : nums) n ^= c;
        return n;
    }
};

