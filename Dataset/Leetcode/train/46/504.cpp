 class Solution {
public:

    int n;
    vector<bool> mark;
    vector<int> cur;
    vector<vector<int>> res;

    vector<vector<int>> XXX(vector<int>& nums) {
        n = nums.size();
        mark = vector<bool>(n, false);
        dfs(nums, 0);
        return res;
    }

    void dfs(vector<int>& nums, int u) {
        if (u == n) {
            res.push_back(cur);
            return;
        }

        for (int i = 0; i < n; ++i) {
            if (!mark[i]) {
                mark[i] = true;
                cur.push_back(nums[i]);
                dfs(nums, u + 1);
                cur.pop_back();
                mark[i] = false;
            }
        }
    }
};

