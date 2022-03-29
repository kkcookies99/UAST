class Solution {
public:
    vector<vector<int>> res;
    vector<int> path;
    vector<vector<int>> XXX(vector<int>& nums) {
        dfs(nums, 0);
        return res;
    }
    void dfs(vector<int> nums, int startIndex) {
        res.push_back(path);
        for(int i = startIndex; i < nums.size(); ++i) {
            path.push_back(nums[i]);

            dfs(nums, i + 1);

            path.pop_back();
        }
    }
};

