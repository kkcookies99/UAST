 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        backtracking(nums, 0, ans);
        return ans; 
    }

    void backtracking(vector<int> &nums, int level, vector<vector<int>> &ans) {
        if (level == nums.size() - 1) {
            ans.push_back(nums);
            return;
        }
        for (int i = level; i < nums.size(); i++) {
            swap(nums[i], nums[level]); // 选择当前节点
            backtracking(nums, level+1, ans); // 递归子节点
            swap(nums[i], nums[level]); // 不选择当前节点状态
        }
    }
};

