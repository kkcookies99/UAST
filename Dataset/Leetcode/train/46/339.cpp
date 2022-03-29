class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        int length = nums.size();
        if (length == 0) return ans;

        vector<bool> used(length, false);
        vector<int> res;
        backtracking(nums, 0, ans, res, used);
        return ans;
    }

    void backtracking(vector<int> &nums, int level, vector<vector<int>> &ans, vector<int> &res, vector<bool> &used)
    {
        if (level == nums.size())
        {
            ans.push_back(res);
            return;
        }
        for (int i = 0; i < nums.size(); i++)
        {
            if (used[i])
            {
                continue;
            }
            res.emplace_back(nums[i]);
            used[i] = true;
            backtracking(nums, level + 1, ans, res, used);
            res.pop_back();
            used[i] = false;
        }
    }
};

