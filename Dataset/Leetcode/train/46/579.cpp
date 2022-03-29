 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> used(10000, 0);
        vector<int> path;
        if(nums.size() == 0) return res;
        dfs(res, nums, used, path, 0);
        return res;
    }
    void dfs(vector<vector<int>>& res, vector<int>& nums, vector<int>& used, vector<int>& path, int depth){
        if(depth == nums.size()){
            res.push_back(path);
            return;
        }
        for(int i = 0; i < nums.size(); i++){
            if(used[i]) continue;
            path.push_back(nums[i]);
            used[i] = true;
            dfs(res, nums, used, path, depth + 1);
            path.pop_back();
            used[i] = false;
        }
    }
};

