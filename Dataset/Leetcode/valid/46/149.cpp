class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        helper(nums, 0, res);
        return res;
    }
    void helper(vector<int> nums, int now, vector<vector<int>>& res)
    {
        if (now == nums.size() - 1)
        {
            res.push_back(nums);
            return;
        }
        for (int i = now; i < nums.size(); ++i)
        {
            swap(nums[now], nums[i]);
            helper(nums, now+1, res);
        }
    }
};

