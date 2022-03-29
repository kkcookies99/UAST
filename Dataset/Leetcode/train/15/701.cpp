 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        sort(nums.begin(), nums.end());
        int n = nums.size();
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] > 0) break;
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = n - 1;
            int target = -nums[i];
            while(l < r) {
                if (nums[l] + nums[r] == target) {
                    res.push_back({nums[i], nums[l], nums[r]});
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l - 1]) l++;
                    while(l < r && nums[r] == nums[r + 1]) r--;
                }
                else if (nums[l] + nums[r] < target) {
                    l++;
                }
                else {
                    r--;
                }
            }
        }
        return res;
    }
};

