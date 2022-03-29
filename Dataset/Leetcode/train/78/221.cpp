class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> result;
        if(nums.empty()){
            return result;
        }
        vector<int> tmp;
        dfs(nums, 0, tmp, result);
        return result;
    }
    void dfs(vector<int>& nums, int current_pos, vector<int> current_vec, vector<vector<int>>& result){
        if(current_pos >= nums.size()){
            result.push_back(current_vec);
            return;
        }
        current_vec.push_back(nums[current_pos]);
        dfs(nums, current_pos+1, current_vec, result);
        current_vec.pop_back();
        dfs(nums, current_pos+1, current_vec, result);
    }
};

