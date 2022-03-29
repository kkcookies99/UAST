 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int sz = nums.size();
        for(int i=1;i<sz;++i)
            nums[0] ^= nums[i];
        return nums[0];
    }
};

