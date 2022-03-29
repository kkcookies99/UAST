class Solution {
    void dfs(vector<vector<int>>& res, vector<int>& nums, vector<int>& tmp,
             int v, bool select) {
        // 如果上一个选了, 加入
        if (select) res.push_back(tmp);

        if (v == nums.size()) return;
        tmp.push_back(nums[v]);
        dfs(res, nums, tmp, v + 1, true);   // 选
        tmp.pop_back();

        dfs(res, nums, tmp, v + 1, false);  // 不选
    }

   public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> tmp;
        dfs(res, nums, tmp, 0, true);

        return res;
    }
};

