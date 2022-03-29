 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        for (int i = nums.size() - 1; i >= 0; i--)
        {
            if (nums[i] == val)
            {
                if (i == nums.size() - 1)
                {
                    nums.pop_back();
                }
                else
                {
                    nums[i] = nums[nums.size() - 1];
                    nums.pop_back();
                }
            }
            
        }

        return nums.size();
    }
};

