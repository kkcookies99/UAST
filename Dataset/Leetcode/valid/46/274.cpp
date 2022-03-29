class Solution {
public:
    vector<vector<int>> res;
    vector<int> path;
    vector<vector<int>> XXX(vector<int>& nums) {
        bool st[nums.size()];
        memset(st, false, sizeof st);
        dfs(nums, st);
        return res;
    }
    void dfs(vector<int>& nums, bool st[]) {
        if(path.size() == nums.size()) {
            res.push_back(path);
            return ;
        }
        for(int i = 0; i < nums.size(); ++i) {
            if(!st[i]) {
                path.push_back(nums[i]);
                st[i] = true;

                dfs(nums, st);

                st[i] = false;
                path.pop_back();
            }
        }
    }
};

