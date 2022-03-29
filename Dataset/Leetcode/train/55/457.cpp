 class Solution {
public:
    bool XXX(vector<int>& nums) {
        if(nums.size() < 2)
            return true;
        int maxofright = nums[0];
        for(int i = 1;i < nums.size();i++)
        {
            if(i <= maxofright)
            {
                maxofright = max(maxofright,i + nums[i]);
                if(maxofright >= nums.size()-1)
                    return true;
            }
        }
        return false;
    }
};

