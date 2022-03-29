 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        int i,j;
        for (i = 0; i < sizeof(nums) / sizeof(nums[0]) - 1; i++)
        {
            for (j = i + 1; j < sizeof(nums) / sizeof(nums[0]); j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    return {i,j};
                }
            }
        }
    return {i,j};
    }
};

