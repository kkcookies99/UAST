class Solution {
public:
    vector<vector<int>> res;
    vector<int> vec;
    void dfs(vector<int>& nums, int k){
        res.emplace_back(vec);
        if(k >= nums.size()) return;
        for(int i = k; i < nums.size(); ++i){
            vec.emplace_back(nums[i]);
            dfs(nums, i+1);
            vec.pop_back();
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        dfs(nums, 0);
        return res;
    }
};

