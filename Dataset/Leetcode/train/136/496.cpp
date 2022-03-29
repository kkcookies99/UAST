 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int a = 0;
        for(int val : nums)
            a ^= val;
        return a;
    }
};

