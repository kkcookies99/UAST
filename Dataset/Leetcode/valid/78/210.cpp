class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> track_list;
        vector<vector<int>> res_list;
        dfs(nums, track_list, 0, res_list);
        return res_list;
    }

    void dfs(vector<int>& nums, vector<int>& track_list, int start_index, vector<vector<int>>& res_list) {
        vector<int> temp_list = track_list;
        res_list.emplace_back(temp_list);
        for (int i = start_index; i < nums.size(); ++i) {
            track_list.emplace_back(nums[i]);
            dfs(nums, track_list, i+1, res_list);
            track_list.pop_back();
        }
    }
};

