 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        for(int i=1;i<nums.size();++i) nums.at(0)^=nums.at(i);
        return nums.at(0);
    }
};

