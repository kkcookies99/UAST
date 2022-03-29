 class Solution {
public:
    //dfs回溯搜索
    vector<vector<int>> res;
    void helper(vector<int>& nums, vector<bool> used, vector<int> temp) {
        if (temp.size() == nums.size()) {
            res.push_back(temp);
            return;
        }
        for (int i = 0; i < nums.size(); i++) {
            if (used[i])
                continue;
            else {
                temp.push_back(nums[i]);
                used[i] = true;
                helper(nums, used, temp);
                used[i] = false;
                temp.pop_back();
            } 
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<bool> used = vector<bool>(nums.size(), false);
        helper(nums, used, {});
        return res;
    }
};

