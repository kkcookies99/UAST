 class Solution {
public:
    void left_push(vector<int>& nums, int& left, int right) {
        do left += 1;
        while (nums[left] == nums[left - 1] && left < right);
    }
    void right_pull(vector<int>& nums, int left, int& right) {
        do right -= 1;
        while (nums[right] == nums[right + 1] && left < right);
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        int n = nums.size(), left, right, tmp;
        vector<vector<int> > ans;
        sort(nums.begin(), nums.end());
        for (int i = 0; i < n - 2; i++) {
            if (i && nums[i] == nums[i - 1]) continue;
            left = i + 1, right = n - 1;
            while (left < right) {
                tmp = nums[left] + nums[right] + nums[i];
                if (tmp < 0) left_push(nums, left, right);
                else if (tmp > 0) right_pull(nums, left, right);
                else {
                    ans.push_back({nums[i], nums[left], nums[right]});
                    left_push(nums, left, right);
                    right_pull(nums, left, right);
                }
            }
        }
        return ans;
    }
};

