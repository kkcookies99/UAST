 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int n = nums.size(), tar;
        vector<vector<int>> res;
        for (int i = 0; i < n-2; ++i) {
            int l = i + 1, r = n-1;
            tar = -nums[i];
            while (l < r) {
                int sum = nums[l] + nums[r];
                if (sum == tar) {
                    res.push_back({nums[i], nums[l], nums[r]});
                }
                if (sum < tar || sum == tar) {
                    while (l < r && nums[l] == nums[l+1]) l++;
                    l++;
                }
                if (sum > tar || sum == tar) {
                    while (l < r && nums[r] == nums[r-1]) r--;
                    r--;
                }
            }
            while (i < n-3 && nums[i] == nums[i+1]) {
                i++;
            }
        }
        return res;
    }
};

