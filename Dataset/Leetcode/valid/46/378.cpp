class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        dfs(nums, res, 0);
        return res;
    }
    void dfs(vector<int>& nums, vector<vector<int>>& res, int index) {
        if (index == nums.size()) {
            res.push_back(nums);
        }
        for (int i = index; i < nums.size(); ++i) {
            swap(nums, i, index);
            dfs(nums, res, index+1);
            swap(nums, index, i);
        }
    }
    
    void swap(vector<int>& nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
};

