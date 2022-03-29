class Solution {
    vector<vector<int>> out;
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        if (nums.size() > 0) {
            next(nums, nums.size());    
        }
        return out;
    }
    
    void next(vector<int> &nums, int n) {
        if (n == 1) {
            out.push_back(nums);
            return;
        }
        for (int i = 0; i < n; ++i) {
            swap(nums[i], nums[n-1]);
            next(nums, n-1);
            swap(nums[i], nums[n-1]);
        }
    }
    
};