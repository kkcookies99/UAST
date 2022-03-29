 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int eor = 0;
        for(int i = 0; i < nums.size(); i++)
        {
            eor ^= nums[i];
        }
        return eor;
    }
};

