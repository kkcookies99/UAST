 class Solution {
public:
    int singleNumber(vector<int>& nums,int i=0) {
        return nums.size()-i?nums[i]^singleNumber(nums,i+1):0;
    }
};

