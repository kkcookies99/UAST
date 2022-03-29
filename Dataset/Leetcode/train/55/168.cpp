class Solution {
public:
    bool XXX(vector<int>& nums) {
        int end = 0;
        int n = nums.size();
        for (int i = 0; i < n; ++i) {
            if (i > end) {
                return false;
            }
            if (i + nums[i] > end) {
                end = i + nums[i];
            }
        }
        return true;
    }
};

