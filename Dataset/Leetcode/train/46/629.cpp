 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        if(nums.size() == 0) return res;
        vector<bool> flags(nums.size(), false);
        vector<int> path;
        dfs(nums, path, res,flags);
        return res;
    }
    void dfs(vector<int>& nums, vector<int>& path, vector<vector<int>>&res, vector<bool>& flags){
        if(path.size() == nums.size()){
            res.push_back(path);
            return;
        }
        for(int i = 0; i < nums.size(); i++){
            if(flags[i]) continue;
            flags[i] = true;
            path.push_back(nums[i]);
            dfs(nums, path, res, flags);
            path.pop_back();
            flags[i] = false;
        }
    }
};

