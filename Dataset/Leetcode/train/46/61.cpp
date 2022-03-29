class Solution {
public:
    vector<vector<int>> res;
    vector<vector<int>> XXX(vector<int>& nums) {
        solve(nums, 0);
        return res;
    }
    void solve(vector<int> &nums, int idx) {
        if(idx == nums.size()-1 || nums.size() == 0){
            res.push_back(nums);
            return;
        }
        for(int i = idx; i < nums.size(); i++){
            swap(nums[idx], nums[i]);
            solve(nums, idx+1);
            swap(nums[idx], nums[i]);
        }
    }
};

