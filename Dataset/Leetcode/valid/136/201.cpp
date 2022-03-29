 class Solution {
public:
    int singleNumber(vector<int>& nums) {
    int a = 0;
    for(int i = 0;i < nums.size();i++)
    a = a^nums[i];
    return a;
    }
};

