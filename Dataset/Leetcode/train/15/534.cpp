 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        if (nums.size() < 3) {
            return ans;
        }
        sort(nums.begin(), nums.end());
        for (int i = 0; i < nums.size() -2;) {
            XXX(ans, nums, i);
            i++;
            while(i < nums.size() -2 && nums[i] == nums[i-1]) {
                i++;
            }
        }
        return ans;
    }

    void XXX(vector<vector<int>>& ans, vector<int>& nums, int targetIndex) {
        int target = (-1) * nums[targetIndex];
        int left = targetIndex + 1;
        int right = nums.size() - 1;
        while(left < right) {
            int value = nums[left] + nums[right];
            if (value < target) {
                left++;
                while(left < right && nums[left] == nums[left-1]) {
                    left++;
                }
            } else if (value > target) {
                right--;
                while(left < right && nums[right] == nums[right+1]) {
                    right--;
                }
            } else {
                vector<int> ret{nums[targetIndex], nums[left], nums[right]};
                ans.push_back(ret);
                left++;
                while(left < right && nums[left] == nums[left-1]) {
                    left++;
                }
                right--;
                while(left < right && nums[right] == nums[right+1]) {
                    right--;
                }
            }
        }
    }
};

