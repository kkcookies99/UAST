class Solution {
public:
    bool XXX(vector<int>& nums)
    {
        if(nums.size() == 0)
            return true;

        int cur = nums[0], i = 1;
        for(; cur != 0 && i < nums.size(); i++)
        {
            cur--;
            if(cur < nums[i])
                cur = nums[i];
        }
        return i == nums.size();
    }
};

