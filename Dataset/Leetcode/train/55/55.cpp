class Solution {
public:
    bool XXX(vector<int>& nums) {
        for (int i = 0, j = 0; i <= j; i++) {
            j = max(i + nums[i], j);
            if (j >= nums.size() - 1) {
                return true;
            }
        }
        return false;
    }
};

