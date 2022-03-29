class Solution {
    vector<vector<int>> ans;
    vector<int> path;
    void dfs(vector<int>& nums, int pos) {
        ans.emplace_back(path);
        for (int i = pos; i < nums.size(); i++) {
            path.emplace_back(nums[i]);
            dfs(nums, i + 1);
            path.pop_back();
        }
    }
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        dfs(nums, 0);
        return ans;
    }
};

