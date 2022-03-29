 class Solution {
public:
    int singleNumber(vector<int>& nums) {        
        return accumulate(nums.begin(), nums.end(), 0, [](const int pre, const int now) {return pre^now;});
    }
};

