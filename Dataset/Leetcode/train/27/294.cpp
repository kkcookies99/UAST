 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
    for(int i = 0;i<nums.size();i++)
    {
        if(nums[i]==val)
        {
            nums.erase(nums.begin()+i);
            i--;
        }
    }
    return nums.size();
    }
};

