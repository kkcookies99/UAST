 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int res = 0;
        for(int n : nums)
        {
            res ^= n;
        }
        return res;
    }
};

