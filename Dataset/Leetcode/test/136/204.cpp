 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int x = 0;
        for(auto i = nums.begin(); i != nums.end(); i++)
            x ^= *i;
        return x;
    }
};

