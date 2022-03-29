class Solution {
public:
    vector<vector<int>> res;
    vector<int> vec;
    void dfs(vector<int> nums, vector<int> path){
        if(vec.size() == nums.size()){
            res.emplace_back(vec);
            return;
        }
        for(int i = 0; i < nums.size(); ++i){
            if(path[i] >= 1) continue;
            vec.emplace_back(nums[i]);
            path[i]++;                      --做标记
            dfs(nums, path);
            vec.pop_back();
            path[i]--;                      --遍历结束删标记
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> path(nums.size(), 0);
        dfs(nums, path);
        return res;
    }
};

