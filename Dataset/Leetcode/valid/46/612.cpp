 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> path;
        vector<bool> used(nums.size(), false);
        dfs(nums, res, path, nums.size(), 0, used);
        return res;
    }

    void dfs(vector<int>& nums, vector<vector<int>>& res, vector<int>& path, int len, int depth, vector<bool>& used) {
        if (depth == len) {
            res.push_back(path);
            return;
        }
        for (int i = 0;i < len;i++) {
            if (!used[i]) {
                path.push_back(nums[i]);
                used[i] = true;
                dfs(nums, res, path, len, depth+1, used);
                used[i] = false;
                path.pop_back();
            }
        }
    }
};

