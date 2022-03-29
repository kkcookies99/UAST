 class Solution {
public:
    vector<vector<int>> res = {};
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.size() >= 3) {
            sort(nums.begin(), nums.end());
            for(int i = 0; i < nums.size() - 2 && nums[i] <= 0; ++i) {
                // 去重
                if(i > 0 && nums[i] == nums[i - 1]) continue;
                XXX(nums, i);
            }
        }
        return res;
    }

    void XXX(vector<int>& nums, int index) {
        // 固定当前数，在后面寻找三者加起来等于0的
        int left = index + 1, right = nums.size() - 1;
        while(left < right) {
            int tmp = nums[index] + nums[left] + nums[right];
            if(tmp == 0) {
                res.push_back({nums[index], nums[left++], nums[right--]});
                // ++left, --right
                // 去重
                while(left < right  && nums[left] == nums[left - 1]) ++left;
                while(left < right && nums[right] == nums[right + 1]) --right;
            }
            else if(tmp < 0) ++left;
            else --right;
        }
    }
};

