 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int n = nums.size();
        vector<vector<int>> res;
        if (n < 3) {
            return res;
        }
        sort(nums.begin(), nums.end());

        for (int i = 0; i < n; ++i) {
            int target = -nums[i];
            int left = i + 1, right = n - 1;
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    res.push_back({-target, nums[left], nums[right]});
                    ++left;
                    --right;
                    while (left < right && nums[left] == nums[left - 1]) {
                        ++left;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        --right;
                    }
                } else if (nums[left] + nums[right] > target) {
                    --right;
                } else {
                    ++left;
                }
            }
            while (i + 1 < n && nums[i] == nums[i + 1]) {
                ++i;
            }
        }

        return res;

    }
};

