class Solution {
public:
    void dfs(const vector<int>& nums, vector<int>& item, int idx, vector<vector<int>>& res){
        if(idx == nums.size()){
            res.push_back(item);
            return;
        }

        dfs(nums, item, idx + 1, res);
        item.push_back(nums[idx]);
        dfs(nums, item, idx + 1, res);
        item.pop_back();
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> item;

        dfs(nums, item, 0, res);
        return res;
    }
};

