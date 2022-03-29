 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int n = nums.size();
        vector<vector<int>> ret;
        if (n < 2) {
            return ret;
        }
        sort(nums.begin(), nums.end());
        for (int i = 0; i < n; ++i) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1, right = n - 1;
            int target = -nums[i];
            while (left < right) {
                if (left != i + 1 && nums[left] == nums[left - 1]) {
                    ++left;
                } else if (right != n - 1 && nums[right] == nums[right + 1]) {
                    --right;
                } else {
                    if (nums[left] + nums[right] < target) {
                        ++left;
                    } else if (nums[left] + nums[right] > target) {
                        --right;
                    } else {
                        ret.push_back({nums[i], nums[left++], nums[right--]});
                    }
                }
            }
        }

        return ret;
    }
};

