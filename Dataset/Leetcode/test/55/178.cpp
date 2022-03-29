class Solution {
public:
    bool XXX(vector<int>& nums) {
        int maxGet = 0;
        int n = nums.size();
        if (n < 2) {
            return true;
        }
        for (int i = 0; i < n; ++i) {
            if (maxGet == i && nums[i] == 0) {
                return false;
            }
            maxGet = max(maxGet, i + nums[i]);
            if (maxGet >= n - 1) {
                return true;
            }
        }
        return true;
    }
};

