 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int diff = 0;
        for(auto &v : nums)
            diff ^= v;
            
        return diff;
    }
};

