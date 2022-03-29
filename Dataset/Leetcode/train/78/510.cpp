 class Solution {
public:
    
    void dfs(vector<int>& nums, int begin, int size, vector<int>& path, vector<vector<int>>& res) {
        if(find(res.begin(), res.end(), path) == res.end() && path.size() <= size) {
            res.push_back(path);
        }
        
        for(int i=begin; i<size; i++) {
            path.push_back(nums[i]);
            dfs(nums, i+1, size, path, res);
            path.pop_back();
        }
    }
    
    
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> path;
        dfs(nums, 0, nums.size(), path, res);
        return res;
    }
};

