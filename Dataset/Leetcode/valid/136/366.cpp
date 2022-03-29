 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int res = 0;
        for(auto p : nums) res ^= p;
        return res;
    }
};

