 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<vector<int>> res;
        for (int i = 0; i < nums.size(); ++i)
        {
            int target = -nums[i];
            int j = i + 1, k = nums.size() - 1;
            while (j < k)
            {
                if (nums[j] + nums[k] < target)
                    ++j;
                else if (nums[j] + nums[k] > target)
                    --k;
                else
                {
                    res.push_back(vector<int>{nums[i], nums[j], nums[k]});
                    int mid = nums[j];
                    int last = nums[k];
                    while (j < k && nums[j] == mid)
                        ++j;
                    while (j < k && nums[k] == last)
                        --k;
                }
            }
            while (i+1 < nums.size() && nums[i] == nums[i+1])
                ++i;
        }
        return res;
    }
};

