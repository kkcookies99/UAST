 class Solution {
public:
    bool XXX(vector<int>& nums) 
    {
        int max_step = 1;      
        for(int i = 0; i < nums.size(); i++)
        {
            max_step--;
            max_step = max(max_step, nums[i]);
            if(nums[i] == 0 && max_step == 0 && i != (nums.size() - 1) )
            return false;
        }
        return true;
    }
};

